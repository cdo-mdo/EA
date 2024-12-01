package org.edu.miu.cs544.assignment_2.data;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private double amount;
    private LocalDateTime paymentDate;

    @Enumerated (EnumType.STRING)
    private PaymentMethod method; // ENUM: CASH, CREDIT_CARD, ONLIE

    @ManyToOne
    private Rental rental;

    private String transactionReference;

    private String status;
}
