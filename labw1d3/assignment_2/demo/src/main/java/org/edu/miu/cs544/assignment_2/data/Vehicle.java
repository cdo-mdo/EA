package org.edu.miu.cs544.assignment_2.data;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String licensePlate;
    private String make;
    private String model;
    private int year;
    private String status;

    @ManyToOne
    private Branch branch;

    @OneToMany(mappedBy = "vehicle")
    private List<MaintenanceRecord> maintenanceRecords;
}
