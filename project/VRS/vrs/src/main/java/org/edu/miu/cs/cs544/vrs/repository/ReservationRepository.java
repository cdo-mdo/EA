package org.edu.miu.cs.cs544.vrs.repository;

import org.edu.miu.cs.cs544.vrs.Entity.Reservation;
import org.edu.miu.cs.cs544.vrs.Entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Integer> {
    boolean existsByVehicleAndPickupDateTimeBetweenOrReturnDateTimeBetween(Vehicle vehicle, LocalDateTime pickupDateTimeAfter, LocalDateTime pickupDateTimeBefore, LocalDateTime returnDateTimeAfter, LocalDateTime returnDateTimeBefore);
}
