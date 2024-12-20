package org.edu.miu.cs.cs544.vrs.controller;

import org.edu.miu.cs.cs544.vrs.Entity.Reservation;
import org.edu.miu.cs.cs544.vrs.dto.ReservationDTO;
import org.edu.miu.cs.cs544.vrs.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/reservations")
public class ReservationController {
    @Autowired
    private ReservationService reservationService;

    @PostMapping()
    public ResponseEntity<String> createReservation(@RequestBody ReservationDTO reservationDTO) {
        System.out.println("creating reservation");
        reservationService.createReservation(reservationDTO);
        return ResponseEntity.ok("Reservation Created");
    }

    @PostMapping("/{reservationId}/cancel")
    public ResponseEntity<String> cancelReservation(@PathVariable Integer reservationId) {
        System.out.println("canceling reservation");
        reservationService.cancelReservation(reservationId);
        return ResponseEntity.ok("Reservation Cancelled " + reservationId);
    }
}
