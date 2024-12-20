package org.edu.miu.cs.cs544.vrs.init;

import org.edu.miu.cs.cs544.vrs.Entity.Role;
import org.edu.miu.cs.cs544.vrs.Entity.RoleName;
import org.edu.miu.cs.cs544.vrs.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InitRole {

    @Autowired
    private RoleRepository roleRepository;

    public void initData() {
        roleRepository.save(new Role(RoleName.ADMIN));
        roleRepository.save(new Role(RoleName.MANAGER));
        roleRepository.save(new Role(RoleName.CUSTOMER_SERVICE_AGENT));
        roleRepository.save(new Role(RoleName.VEHICLE_PREP_AGENT));
        roleRepository.save(new Role(RoleName.ON_CALL_DRIVER));
    }
}
