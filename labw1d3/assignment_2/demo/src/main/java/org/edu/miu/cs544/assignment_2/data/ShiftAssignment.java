package org.edu.miu.cs544.assignment_2.data;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class ShiftAssignment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate shiftDate;

    @ManyToOne
    private Shift shift;

    @ManyToOne
    private Employee employee;
}

