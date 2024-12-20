package org.edu.miu.cs.cs544.vrs.Entity;

import jakarta.persistence.Entity;

import java.time.LocalDate;

@Entity
public class CreditCardPayment extends Payment {
    private String cardNumber;
    private LocalDate expiryDate;
}
