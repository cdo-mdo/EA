package org.edu.miu.cs.cs544.vrs.controller;

import org.edu.miu.cs.cs544.vrs.dto.EmployeeDTO;
import org.edu.miu.cs.cs544.vrs.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PreAuthorize("hasRole('MANAGER')")
    @PostMapping
    public ResponseEntity<String> registerEmployee(@RequestBody EmployeeDTO employeeDTO) {
        System.out.println("register employee");
        employeeService.registerEmployee(employeeDTO);
        return ResponseEntity.ok("Employee registered successfully");
    }
}
