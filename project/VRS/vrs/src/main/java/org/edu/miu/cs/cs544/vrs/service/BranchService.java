package org.edu.miu.cs.cs544.vrs.service;

import org.edu.miu.cs.cs544.vrs.Entity.*;
import org.edu.miu.cs.cs544.vrs.dto.BranchDTO;
import org.edu.miu.cs.cs544.vrs.dto.EmployeeDTO;
import org.edu.miu.cs.cs544.vrs.repository.BranchRepository;
import org.edu.miu.cs.cs544.vrs.repository.EmployeeRepository;
import org.edu.miu.cs.cs544.vrs.repository.RoleRepository;
import org.edu.miu.cs.cs544.vrs.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class BranchService {
    @Autowired
    private BranchRepository branchRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;


    public void registerBranch(BranchDTO branchDTO) {
        Branch branch = new Branch(branchDTO.getName(), branchDTO.getAddress(), branchDTO.getPhone());
        branchRepository.save(branch);
    }

    public void registerManager(long branchId, EmployeeDTO employeeDTO) {
        // Check if the branch exists
        Branch branch = branchRepository.findById(branchId)
                .orElseThrow(() -> new IllegalArgumentException("Branch not found with ID: " + branchId));

        // Check if the role Manager exists
        Role managerRole = roleRepository.findByName(RoleName.MANAGER)
                .orElseThrow(() -> new IllegalArgumentException("Role Manager not found"));

        // Create the manager as an Employee
        Employee manager = new Employee();
        manager.setName(employeeDTO.getName());
        manager.setEmployeeId(employeeDTO.getEmployeeId());
        manager.setBranch(branch);
        manager.setRole(managerRole);
        manager.setShiftSchedule(ShiftSchedule.MORNING_8_TO_4);
        employeeRepository.save(manager);

        // Create the manager's user account
        User user = new User();
        user.setUsername(employeeDTO.getUsername());
        user.setPassword(passwordEncoder.encode(employeeDTO.getPassword()));
        user.setRole(managerRole);
        user.setEmployee(manager);
        userRepository.save(user);

        // Set the branch's manager
        branch.setManagedBy(manager);
        branchRepository.save(branch);
    }

}
