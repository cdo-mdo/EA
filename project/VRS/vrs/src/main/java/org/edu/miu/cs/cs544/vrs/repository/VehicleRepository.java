package org.edu.miu.cs.cs544.vrs.repository;

import org.edu.miu.cs.cs544.vrs.Entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository("VehicleRepository")
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
    @Query("""
    SELECT v
    FROM Vehicle v
    WHERE v.vehicleId NOT IN (
        SELECT r.vehicle.vehicleId
        FROM Reservation r
        WHERE :targetTime BETWEEN r.pickupDateTime AND r.returnDateTime
    )
    AND v.vehicleId NOT IN (
        SELECT re.vehicle.vehicleId
        FROM Rental re
        WHERE :targetTime BETWEEN re.pickupDate AND re.returnDate
    )
""")
    List<Vehicle> findAvailableVehicles(@Param("targetTime") LocalDateTime targetTime);
}
