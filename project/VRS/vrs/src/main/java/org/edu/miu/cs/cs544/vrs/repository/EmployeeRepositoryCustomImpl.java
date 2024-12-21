package org.edu.miu.cs.cs544.vrs.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.criteria.*;
import org.edu.miu.cs.cs544.vrs.Entity.Branch;
import org.edu.miu.cs.cs544.vrs.Entity.Employee;
import org.edu.miu.cs.cs544.vrs.Entity.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeRepositoryCustomImpl implements EmployeeRepositoryCustom {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Employee> findEmployees(String name, String role, Long branchId, String userName) {
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Employee> query = builder.createQuery(Employee.class);
        Root<Employee> employee = query.from(Employee.class);

        // Join with branch and user entity
        Join<Employee, Branch> branch = employee.join("branch", JoinType.LEFT);
        Join<Employee, User> user = employee.join("user", JoinType.LEFT);

        // Build WHERE clause dynamically
        List<Predicate> predicates = new ArrayList<>();

        if (name != null && !name.isEmpty()) {
            predicates.add(builder.equal(employee.get("name"), "%" + name + "%"));
        }
//        if (role != null && !role.isEmpty()) {
//            predicates.add(builder.equal(employee.get("role"), role));
//        }
        if (branchId != null) {
            predicates.add(builder.equal(employee.get("branch"), branchId));
        }

        if (userName != null && !userName.isEmpty()) {
            predicates.add(builder.equal(employee.get("userName"), userName));
        }

        // Apply predicate to the query
        query.select(employee).where(builder.and(predicates.toArray(new Predicate[predicates.size()])));

        return entityManager.createQuery(query).getResultList();
    }
}
