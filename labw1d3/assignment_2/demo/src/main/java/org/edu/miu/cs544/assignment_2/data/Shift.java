package org.edu.miu.cs544.assignment_2.data;

import jakarta.persistence.*;

import java.time.LocalTime;
import java.util.List;

@Entity
public class Shift {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name; // e.g., "Morning", "Evening", "Night"
    private LocalTime startTime;
    private LocalTime endTime;

    @ManyToOne
    private Branch branch;

    @OneToMany(mappedBy = "shift")
    private List<ShiftAssignment> assignments;
}
