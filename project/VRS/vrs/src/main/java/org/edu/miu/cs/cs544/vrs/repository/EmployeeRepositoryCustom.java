package org.edu.miu.cs.cs544.vrs.repository;

import org.edu.miu.cs.cs544.vrs.Entity.Employee;

import java.util.List;

public interface EmployeeRepositoryCustom {
    List<Employee> findEmployees(String name, String role, Long branchId, String userName);
}
