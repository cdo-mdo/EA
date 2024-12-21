package org.edu.miu.cs.cs544.vrs.init;

import org.edu.miu.cs.cs544.vrs.Entity.Role;
import org.edu.miu.cs.cs544.vrs.Entity.RoleName;
import org.edu.miu.cs.cs544.vrs.Entity.User;
import org.edu.miu.cs.cs544.vrs.repository.BranchRepository;
import org.edu.miu.cs.cs544.vrs.repository.RoleRepository;
import org.edu.miu.cs.cs544.vrs.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class InitUser {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public void initData() {
        if (!userRepository.findByUsername("admin").isPresent()) {
            Role adminRole = roleRepository.findByName(RoleName.ADMIN)
                    .orElseGet(() -> roleRepository.save(new Role(RoleName.ADMIN)));
            User adminUser = new User("admin",
                    passwordEncoder.encode("admin"), adminRole);
            userRepository.save(adminUser);
        }


    }
}
