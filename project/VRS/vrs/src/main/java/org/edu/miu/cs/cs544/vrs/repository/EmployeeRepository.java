package org.edu.miu.cs.cs544.vrs.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.edu.miu.cs.cs544.vrs.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("EmployeeRepository")
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> findByBranchId(long branchId);
}
