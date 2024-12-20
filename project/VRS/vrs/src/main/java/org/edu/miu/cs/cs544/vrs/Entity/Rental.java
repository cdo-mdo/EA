package org.edu.miu.cs.cs544.vrs.Entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Rental {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private LocalDateTime pickupDate;
    private LocalDateTime returnDate;
    private LocalDateTime actualPickupDate;
    private LocalDateTime actualReturnDate;
    private double totalCost;
    private RentalStatus status;

    @OneToOne
    @JoinColumn(name = "vehicle_id", nullable = false, updatable = true)
    private Vehicle vehicle;

    @OneToMany (mappedBy = "rental", cascade = CascadeType.ALL, orphanRemoval = true)
    List<Payment> payments;

    @OneToOne
    @JoinColumn(name = "reservation_id", nullable = true)
    private Reservation reservation;

    @ManyToOne
    @JoinColumn (name = "customer_id", nullable = false)
    private Customer customer;

    public Rental() {

    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public LocalDateTime getPickupDate() {
        return pickupDate;
    }
    public void setPickupDate(LocalDateTime pickupDate) {
        this.pickupDate = pickupDate;
    }
    public LocalDateTime getReturnDate() {
        return returnDate;
    }
    public void setReturnDate(LocalDateTime returnDate) {
        this.returnDate = returnDate;
    }
    public LocalDateTime getActualPickupDate() {
        return actualPickupDate;
    }
    public void setActualPickupDate(LocalDateTime actualPickupDate) {
        this.actualPickupDate = actualPickupDate;
    }
    public LocalDateTime getActualReturnDate() {
        return actualReturnDate;
    }
    public void setActualReturnDate(LocalDateTime actualReturnDate) {
        this.actualReturnDate = actualReturnDate;
    }
    public double getTotalCost() {
        return totalCost;
    }
    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }
    public RentalStatus getStatus() {
        return status;
    }
    public void setStatus(RentalStatus status) {
        this.status = status;
    }
    public Vehicle getVehicle() {
        return vehicle;
    }
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    public List<Payment> getPayments() {
        return payments;
    }
    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }
    public Reservation getReservation() {
        return reservation;
    }
    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }
    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
