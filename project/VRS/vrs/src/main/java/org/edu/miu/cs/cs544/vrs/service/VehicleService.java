package org.edu.miu.cs.cs544.vrs.service;

import org.edu.miu.cs.cs544.vrs.Entity.*;
import org.edu.miu.cs.cs544.vrs.dto.VehicleDTO;
import org.edu.miu.cs.cs544.vrs.repository.BranchRepository;
import org.edu.miu.cs.cs544.vrs.repository.UserRepository;
import org.edu.miu.cs.cs544.vrs.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
public class VehicleService {
    @Autowired
    private VehicleRepository vehicleRepository;

    @Autowired
    private BranchRepository branchRepository;

    @Autowired
    private UserRepository userRepository;

    public void registerVehicle(VehicleDTO vehicleDTO) {
        // Get the current authenticated user
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        User currentUser = userRepository.findByUsername(username)
                .orElseThrow(() -> new RuntimeException("User not found"));

        // Ensure the user is associated wth a manager role
        if (currentUser.getRole().getRoleName() != RoleName.MANAGER) {
            throw new IllegalArgumentException("User " + username + " has no role " + RoleName.MANAGER);
        }

        Employee manager = currentUser.getEmployee();

        // Register the vehicle for the branch
        Vehicle vehicle = new Vehicle();
        vehicle.setLicensePlate(vehicleDTO.getLicensePlate());
        vehicle.setMake(vehicleDTO.getMake());
        vehicle.setModel(vehicleDTO.getModel());
        vehicle.setColor(vehicleDTO.getColor());
        vehicle.setYear(vehicleDTO.getYear());
        vehicle.setYear(vehicleDTO.getYear());
        vehicle.setStatus(VehicleStatus.valueOf(vehicleDTO.getStatus()));
        vehicle.setBranch(manager.getBranch());

        vehicleRepository.save(vehicle);

    }

}
