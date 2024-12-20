package org.edu.miu.cs.cs544.vrs.service;

import org.edu.miu.cs.cs544.vrs.Entity.*;
import org.edu.miu.cs.cs544.vrs.dto.EmployeeDTO;
import org.edu.miu.cs.cs544.vrs.repository.BranchRepository;
import org.edu.miu.cs.cs544.vrs.repository.EmployeeRepository;
import org.edu.miu.cs.cs544.vrs.repository.RoleRepository;
import org.edu.miu.cs.cs544.vrs.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private BranchRepository branchRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public void registerEmployee(EmployeeDTO employeeDTO) {
        // Get the currently authenticated user (Manager)
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        User currentUser = userRepository.findByUsername(username)
                .orElseThrow(() -> new RuntimeException("User not found " + username));

        if (currentUser.getRole().getName() != RoleName.MANAGER) {
            throw new RuntimeException("User is not a manager " + username);
        }

        Employee manager = currentUser.getEmployee();
        if (manager == null) {
            throw new RuntimeException("Not found manager for user " + username);

        }

        // Find branch managed by this manager
        Branch branch = branchRepository.findByManagedBy(manager);
        if (branch == null) {
            throw new RuntimeException("Branch not found " + username);
        }

        System.out.println("DEBUG role name " + employeeDTO.getRole());
        // Get specified role
        RoleName roleName = RoleName.valueOf(employeeDTO.getRole());

        Role role = roleRepository.findByName(roleName)
                .orElseThrow(() -> new RuntimeException("Role not found " + employeeDTO.getRole()));

        Employee employee = new Employee();
        employee.setEmployeeId(employeeDTO.getEmployeeId());
        employee.setName(employeeDTO.getName().trim());
        employee.setRole(role);
        employee.setShiftSchedule(employeeDTO.getShift());
        employee.setBranch(branch);
        employeeRepository.save(employee);

        // If the role is not ON_CALL_DRIVER, create a User account
        if (!RoleName.ON_CALL_DRIVER.equals(roleName)) {
            User user = new User();
            user.setUsername(employeeDTO.getUsername());
            user.setPassword(passwordEncoder.encode(employeeDTO.getPassword()));
            user.setRole(role);
            user.setEmployee(employee);
            userRepository.save(user);
        }

    }
}
