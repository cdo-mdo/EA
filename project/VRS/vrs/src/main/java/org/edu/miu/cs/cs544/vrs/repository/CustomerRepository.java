package org.edu.miu.cs.cs544.vrs.repository;

import org.edu.miu.cs.cs544.vrs.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("CustomerRepository")
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Customer findByEmail(String email);
}
