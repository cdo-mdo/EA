package org.edu.miu.cs.cs544.vrs.repository;

import org.edu.miu.cs.cs544.vrs.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository ("UserRepository")
public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByUsername(String username);
}
