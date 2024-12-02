package org.edu.miu.cs544.exercise_3;

import jakarta.persistence.*;

@Entity
public class Order {
    @Id
    @GeneratedValue
    private int id;
    private int quantity;

    private Customer customer;

    public Order() {
        super();
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
