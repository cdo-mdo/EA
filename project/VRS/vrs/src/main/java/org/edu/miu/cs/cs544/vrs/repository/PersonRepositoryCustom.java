package org.edu.miu.cs.cs544.vrs.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.edu.miu.cs.cs544.vrs.Entity.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public class PersonRepositoryCustom {
    @PersistenceContext
    private EntityManager entityManager;

    public List<Employee> findEmployeesByRole(Role role) {
        return entityManager.createNamedQuery("Employee.findByRole", Employee.class)
                .setParameter("role", role)
                .getResultList();
    }

    public List<Employee> findEmployeesByShiftSchedule(ShiftSchedule shiftSchedule) {
        return entityManager.createNamedQuery("Employee.findByShiftSchedule", Employee.class)
                .setParameter("shiftSchedule", shiftSchedule)
                .getResultList();
    }

    public List<Customer> findCustomersByMembershipLevel(MembershipLevel membershipLevel) {
        return entityManager.createNamedQuery("Customer.findByMembershipLevel", Customer.class)
                .setParameter("membershipLevel", membershipLevel)
                .getResultList();
    }

    public Customer findCustomerByDriverLicenseNumber(String driverLicenseNumber) {
        return entityManager.createNamedQuery("Customer.findByDriverLicenseNumber", Customer.class)
                .setParameter("driverLicenseNumber", driverLicenseNumber)
                .getSingleResult();
    }
}
