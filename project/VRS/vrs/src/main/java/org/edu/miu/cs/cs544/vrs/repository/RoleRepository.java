package org.edu.miu.cs.cs544.vrs.repository;

import org.edu.miu.cs.cs544.vrs.Entity.Role;
import org.edu.miu.cs.cs544.vrs.Entity.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository("RoleRepository")
public interface RoleRepository extends JpaRepository<Role, Integer> {
    Optional<Role> findByName(RoleName name);
}
