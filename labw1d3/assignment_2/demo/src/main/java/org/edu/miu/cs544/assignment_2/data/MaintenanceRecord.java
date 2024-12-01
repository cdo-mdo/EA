package org.edu.miu.cs544.assignment_2.data;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class MaintenanceRecord {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    private LocalDateTime date;
    private String description;
    private double cost;
    private String status;

    @ManyToOne
    private Vehicle vehicle;

    public MaintenanceRecord() {

    }
    public MaintenanceRecord(final LocalDateTime date, final String description, final double cost, final String status) {
        this.date = date;
        this.description = description;
        this.cost = cost;
        this.status = status;
    }
    public long getId() {
        return id;
    }
    public void setId(final long id) {
        this.id = id;
    }
    public LocalDateTime getDate() {
        return date;
    }
    public void setDate(final LocalDateTime date) {
        this.date = date;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(final String description) {
        this.description = description;
    }
    public double getCost() {
        return cost;
    }
    public void setCost(final double cost) {
        this.cost = cost;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(final String status) {
        this.status = status;
    }
}
