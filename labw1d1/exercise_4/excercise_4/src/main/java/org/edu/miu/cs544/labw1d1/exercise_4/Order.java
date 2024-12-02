package org.edu.miu.cs544.labw1d1.exercise_4;

import jakarta.persistence.*;

@Entity
public class Order {
    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    private int id;

    private int quantity;

    @ManyToOne
    private Customer customer;

    public Order() {

    }
    public Order(int quantity, Customer customer) {
        this.quantity = quantity;
        this.customer = customer;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
