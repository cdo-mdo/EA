package org.edu.miu.cs.cs544.vrs.service;

import org.edu.miu.cs.cs544.vrs.Entity.Customer;
import org.edu.miu.cs.cs544.vrs.Entity.Rental;
import org.edu.miu.cs.cs544.vrs.Entity.Reservation;
import org.edu.miu.cs.cs544.vrs.Entity.Vehicle;
import org.edu.miu.cs.cs544.vrs.dto.RentalDTO;
import org.edu.miu.cs.cs544.vrs.repository.CustomerRepository;
import org.edu.miu.cs.cs544.vrs.repository.RentalRepository;
import org.edu.miu.cs.cs544.vrs.repository.ReservationRepository;
import org.edu.miu.cs.cs544.vrs.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RentalService {
    @Autowired
    private VehicleRepository vehicleRepository;

    @Autowired
    private ReservationRepository reservationRepository;

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private RentalRepository rentalRepository;

    public void createRental(RentalDTO rentalDTO) {
        // Check if vehicle exist
        Vehicle vehicle = vehicleRepository.findById(rentalDTO.getVehicleId())
                .orElseThrow(()-> new IllegalArgumentException("Vehicle not found " + rentalDTO.getVehicleId()));

        // Check for existing reservation if reservation id is provided
        Reservation reservation = null;
        if (rentalDTO.getReservationId() != null) {
            reservation = reservationRepository.findById(rentalDTO.getReservationId().intValue())
                    .orElseThrow(()-> new IllegalArgumentException(
                            "Reservation not found " + rentalDTO.getReservationId()));

            // Ensure the reservation
            if (!reservation.getVehicle().equals(vehicle)) {
                throw new IllegalArgumentException("Vehicle does not match selected vehicle");
            }
        }

        Customer customer = customerRepository.findByEmail(rentalDTO.getEmail());
        if (customer == null) {
            customer = new Customer();
            customer.setEmail(rentalDTO.getEmail());
            customer.setMobileNumber(rentalDTO.getPhone());
            customer.setName(rentalDTO.getCustomerName());
            customer.setDriverLicenseNumber(rentalDTO.getDriverLicenseNumber());
            customerRepository.save(customer);
        }

        // Create the rental
        Rental rental = new Rental();
        rental.setVehicle(vehicle);
        if (reservation != null) {
            rental.setReservation(reservation);
        }
        rental.setPickupDate(rentalDTO.getPickupDate());
        rental.setReturnDate(rentalDTO.getReturnDate());
        rental.setCustomer(customer);
        rentalRepository.save(rental);
    }

}
