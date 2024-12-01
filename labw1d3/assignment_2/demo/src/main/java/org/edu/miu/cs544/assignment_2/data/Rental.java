package org.edu.miu.cs544.assignment_2.data;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Rental {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate rentalDate;
    private LocalDate returnDate;
    private double totalCost;
    private String status;

    @OneToOne
    private Reservation reservation;

    @ManyToOne
    private Customer customer;

    @ManyToOne
    private Employee employee;

    @ManyToOne
    private Branch branch;

    @OneToMany(mappedBy = "rental")
    private List<Payment> payments;
}

