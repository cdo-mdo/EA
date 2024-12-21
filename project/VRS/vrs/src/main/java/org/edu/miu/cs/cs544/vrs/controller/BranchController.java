package org.edu.miu.cs.cs544.vrs.controller;

import org.edu.miu.cs.cs544.vrs.Entity.Employee;
import org.edu.miu.cs.cs544.vrs.dto.BranchDTO;
import org.edu.miu.cs.cs544.vrs.dto.EmployeeDTO;
import org.edu.miu.cs.cs544.vrs.service.BranchService;
import org.edu.miu.cs.cs544.vrs.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/branches")
public class BranchController {

    @Autowired
    private BranchService branchService;

    @Autowired
    private EmployeeService employeeService;

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping
    public ResponseEntity<String> registerBranch(@RequestBody BranchDTO branchDTO) {
        System.out.println("register branch");
        branchService.registerBranch(branchDTO);
        return ResponseEntity.ok("Branch Registered Successfully");
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/{branchId}/manager")
    public ResponseEntity<String> registerManager(
            @PathVariable long branchId,
            @RequestBody EmployeeDTO employeeDTO) {
        System.out.println("register manager");
        branchService.registerManager(branchId, employeeDTO);
        return ResponseEntity.ok("Manager register successfully for branch ID " + branchId);
    }

    @GetMapping("/search")
    public List<Employee> searchEmployees(
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String role,
            @RequestParam(required = false) Long branchId,
            @RequestParam(required = false) String username) {
        return employeeService.searchEmployees(name, role, branchId, username);
    }
}
