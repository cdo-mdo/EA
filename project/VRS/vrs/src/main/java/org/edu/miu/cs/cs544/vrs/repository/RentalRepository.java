package org.edu.miu.cs.cs544.vrs.repository;

import org.edu.miu.cs.cs544.vrs.Entity.Rental;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("RentalRepository")
public interface RentalRepository extends JpaRepository<Rental, Integer> {

}
