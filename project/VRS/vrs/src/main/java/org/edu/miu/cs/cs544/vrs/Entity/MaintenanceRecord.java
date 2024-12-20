package org.edu.miu.cs.cs544.vrs.Entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class MaintenanceRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String description;
    private LocalDateTime date;
    private double cost;
    private MaintenanceStatus status;

    @ManyToOne
    @JoinColumn (name = "vehicle_id", nullable = false)
    private Vehicle vehicle;
}
