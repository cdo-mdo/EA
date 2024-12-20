package org.edu.miu.cs.cs544.vrs.controller;

import org.edu.miu.cs.cs544.vrs.Entity.Vehicle;
import org.edu.miu.cs.cs544.vrs.dto.VehicleDTO;
import org.edu.miu.cs.cs544.vrs.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/vehicles")
public class VehicleController {
    @Autowired
    private VehicleService vehicleService;

    @PreAuthorize("hasRole('MANAGER')")
    @PostMapping()
    public ResponseEntity<String> registerVehicle(
            @RequestBody VehicleDTO vehicleDTO) {
        System.out.println("regster vehicle: ");
        vehicleService.registerVehicle(vehicleDTO);
        return ResponseEntity.ok("Vehicle registered successfully");
    }
}
