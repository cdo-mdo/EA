package org.edu.miu.cs.cs544.vrs.Entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private double amount;
    private LocalDateTime paymentDate;

    @ManyToOne
    @JoinColumn(name = "rental_id", nullable = true)
    private Rental rental;

    @OneToOne
    @JoinColumn(name = "reservation_id", nullable = true)
    private Reservation reservation;
}
