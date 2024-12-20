package org.edu.miu.cs.cs544.vrs.Entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;

@Entity
public class Branch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String address;
    private String phone;
    private LocalDateTime createdDate;

    @OneToOne
    @JoinColumn(name = "manager_id", referencedColumnName = "id", nullable = true)
    private Employee managedBy;

    @OneToMany(mappedBy = "branch", cascade = CascadeType.ALL, orphanRemoval = true)
    private Collection<Employee> employees;

    @OneToMany (mappedBy = "branch", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Vehicle> vehicles;

    public Branch() {
    }

    public Branch(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.createdDate = LocalDateTime.now();
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    @Override
    public String toString() {
        return "Branch [id=" + id + ", name=" + name + ", address=" + address + ", phone=" + phone + "]";
    }
    public Collection<Employee> getEmployees() {
        return employees;
    }
    public void setEmployees(Collection<Employee> employees) {
        this.employees = employees;
    }
    public Employee getManagedBy() {
        return managedBy;
    }
    public void setManagedBy(Employee managedBy) {
        this.managedBy = managedBy;
    }
    public LocalDateTime getCreatedDate() {
        return createdDate;
    }
    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }
}
