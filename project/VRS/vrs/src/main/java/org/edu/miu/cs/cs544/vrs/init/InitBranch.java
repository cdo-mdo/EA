package org.edu.miu.cs.cs544.vrs.init;

import org.edu.miu.cs.cs544.vrs.Entity.Branch;
import org.edu.miu.cs.cs544.vrs.repository.BranchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InitBranch {
    @Autowired
    private BranchRepository branchRepository;

    public void initData() {
        Branch branch1 = new Branch("Downtown Rent-A-Car",
                "123 Main Street Los Angeles, CA 90012", "213-555-1234");
        Branch branch2 = new Branch("Lone Star Rentals",
                "456 Oak Avenue Austin, TX 78704", "512-555-4567");
        Branch branch3 = new Branch("Empire Car Rentals",
                "789 Broadway New York, NY 10010", "212-555-7890");
        branchRepository.save(branch1);
        branchRepository.save(branch2);
        branchRepository.save(branch3);
    }
}
