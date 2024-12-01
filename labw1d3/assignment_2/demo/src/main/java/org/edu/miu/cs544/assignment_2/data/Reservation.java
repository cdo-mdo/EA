package org.edu.miu.cs544.assignment_2.data;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime reservationDate;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private String status;

    @ManyToOne
    private Customer customer;

    @ManyToOne
    private Vehicle vehicle;

    @ManyToOne
    private Branch branch;
}
