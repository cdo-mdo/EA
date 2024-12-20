package org.edu.miu.cs.cs544.vrs.controller;

import org.edu.miu.cs.cs544.vrs.dto.RentalDTO;
import org.edu.miu.cs.cs544.vrs.service.RentalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/rentals")
public class RentalController {
    @Autowired
    private RentalService rentalService;

    @PreAuthorize("hasRole('CUSTOMER_SERVICE_AGENT')")
    @PostMapping
    public ResponseEntity<String> createRental(@RequestBody RentalDTO rentalDTO) {
        System.out.println("create rental");
        rentalService.createRental(rentalDTO);
        return ResponseEntity.ok("create rental success");
    }
}
