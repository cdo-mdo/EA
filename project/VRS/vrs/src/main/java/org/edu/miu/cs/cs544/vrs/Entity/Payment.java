package org.edu.miu.cs.cs544.vrs.Entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String receiptNumber;
    private double amount;
    private LocalDateTime paymentDate;
    private PaymentType paymentType;

    @ManyToOne
    @JoinColumn(name = "rental_id", nullable = true)
    private Rental rental;

    @OneToOne
    @JoinColumn(name = "reservation_id", nullable = true)
    private Reservation reservation;

    public String getReceiptNumber() {
        return receiptNumber;
    }
    public void setReceiptNumber(String receiptNumber) {
        this.receiptNumber = receiptNumber;
    }

    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDateTime getPaymentDate() {
        return paymentDate;
    }
    public void setPaymentDate(LocalDateTime paymentDate) {
        this.paymentDate = paymentDate;
    }
    public Rental getRental() {
        return rental;
    }
    public void setRental(Rental rental) {
        this.rental = rental;
    }
    public Reservation getReservation() {
        return reservation;
    }
    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }
    public PaymentType getPaymentType() {
        return paymentType;
    }
    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

}
