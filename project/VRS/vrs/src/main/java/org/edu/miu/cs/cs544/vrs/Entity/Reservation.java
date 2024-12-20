package org.edu.miu.cs.cs544.vrs.Entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = true)
    private Customer customer;

    @OneToOne
    @JoinColumn(name = "vehicle_id", nullable = false, unique = true)
    private Vehicle vehicle;

    @OneToOne (mappedBy = "reservation")
    private Rental rental;

    @OneToOne(mappedBy = "reservation")
    private Payment payment;

    private LocalDateTime reservationDate;
    private LocalDateTime pickupDateTime;
    private LocalDateTime returnDateTime;
    private ReservationStatus status;

    public Reservation() {

    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public Vehicle getVehicle() {
        return vehicle;
    }
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    public Rental getRental() {
        return rental;
    }
    public void setRental(Rental rental) {
        this.rental = rental;
    }
    public Payment getPayment() {
        return payment;
    }
    public void setPayment(Payment payment) {
        this.payment = payment;
    }
    public LocalDateTime getReservationDate() {
        return reservationDate;
    }
    public void setReservationDate(LocalDateTime reservationDate) {
        this.reservationDate = reservationDate;
    }
    public LocalDateTime getPickupDateTime() {
        return pickupDateTime;
    }
    public void setPickupDateTime(LocalDateTime pickupDateTime) {
        this.pickupDateTime = pickupDateTime;
    }
    public LocalDateTime getReturnDateTime() {
        return returnDateTime;
    }
    public void setReturnDateTime(LocalDateTime returnDateTime) {
        this.returnDateTime = returnDateTime;
    }
    public ReservationStatus getStatus() {
        return status;
    }
    public void setStatus(ReservationStatus status) {
        this.status = status;
    }
}
