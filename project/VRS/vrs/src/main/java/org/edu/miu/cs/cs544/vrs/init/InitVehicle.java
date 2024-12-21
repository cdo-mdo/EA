package org.edu.miu.cs.cs544.vrs.init;

import org.edu.miu.cs.cs544.vrs.Entity.Branch;
import org.edu.miu.cs.cs544.vrs.Entity.Vehicle;
import org.edu.miu.cs.cs544.vrs.config.VehicleConfig;
import org.edu.miu.cs.cs544.vrs.repository.BranchRepository;
import org.edu.miu.cs.cs544.vrs.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class InitVehicle {
    @Autowired
    private BranchRepository branchRepository;

    @Autowired
    private VehicleRepository vehicleRepository;

    @Autowired
    private VehicleConfig vehicleConfig;

    public void initData() {
        List<Vehicle> vehicles = vehicleConfig.vehicles();
        Branch branch = branchRepository.findById(1L).get();
        vehicles.forEach(v -> {
            v.setBranch(branch);
            vehicleRepository.save(v);
        });
    }
}
