package org.edu.miu.cs.cs544.vrs.repository;

import org.edu.miu.cs.cs544.vrs.Entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("PaymentRepository")
public interface PaymentRepository extends JpaRepository<Payment, Integer> {
}
