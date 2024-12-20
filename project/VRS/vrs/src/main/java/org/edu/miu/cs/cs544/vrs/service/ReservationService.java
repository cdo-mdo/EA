package org.edu.miu.cs.cs544.vrs.service;

import org.edu.miu.cs.cs544.vrs.Entity.Customer;
import org.edu.miu.cs.cs544.vrs.Entity.Reservation;
import org.edu.miu.cs.cs544.vrs.Entity.ReservationStatus;
import org.edu.miu.cs.cs544.vrs.Entity.Vehicle;
import org.edu.miu.cs.cs544.vrs.dto.ReservationDTO;
import org.edu.miu.cs.cs544.vrs.repository.CustomerRepository;
import org.edu.miu.cs.cs544.vrs.repository.ReservationRepository;
import org.edu.miu.cs.cs544.vrs.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationService {
    @Autowired
    private VehicleRepository vehicleRepository;

    @Autowired
    private ReservationRepository reservationRepository;

    @Autowired
    private CustomerRepository customerRepository;

    public void createReservation(ReservationDTO reservationDTO) {
        // Check if the vehicle exists
        Vehicle vehicle = vehicleRepository.findById(reservationDTO.getVehicleId())
                .orElseThrow(() -> new IllegalArgumentException(
                        "Vehicle not found with ID: " + reservationDTO.getVehicleId()));

        // Check if the vehicle is already reserved
        if (reservationRepository.existsByVehicleAndPickupDateTimeBetweenOrReturnDateTimeBetween(
                vehicle, reservationDTO.getPickupDateTime(), reservationDTO.getReturnDateTime(),
                reservationDTO.getPickupDateTime(), reservationDTO.getReturnDateTime())) {
            throw new IllegalArgumentException("The vehicle is already reserved for the selected date");
        }

        Customer customer = customerRepository.findByEmail(reservationDTO.getEmail());
        if (customer == null) {
            customer = new Customer();
            customer.setEmail(reservationDTO.getEmail());
            customer.setEmail(reservationDTO.getEmail());
            customer.setMobileNumber(reservationDTO.getPhone());
            customerRepository.save(customer);
        }

        System.out.println("save customer: " + customer);

        // Create the reservation
        Reservation reservation = new Reservation();
        reservation.setVehicle(vehicle);
        reservation.setCustomer(customer);
        reservation.setPickupDateTime(reservationDTO.getPickupDateTime());
        reservation.setReturnDateTime(reservationDTO.getReturnDateTime());
        reservationRepository.save(reservation);

        System.out.println("save reservation: ");
    }

    public void cancelReservation(Integer reservationId) {
        Reservation reservation = reservationRepository.findById(reservationId)
                .orElseThrow(() -> new IllegalArgumentException("Reservation not found with ID: " + reservationId));

        reservation.setStatus(ReservationStatus.CANCELLED);
        reservationRepository.save(reservation);
    }
}
