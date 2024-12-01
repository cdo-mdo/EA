package org.edu.miu.cs544.assignment_2.data;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Customer extends Person {
    private String driverLicense;
    private String memberShipLevel;

    @OneToMany(mappedBy = "customer")
    private List<Reservation> reservations;

    public Customer() {
        super();
    }
    public Customer(String firstName, String lastName,
                    String mobileNumber, String email, Address address, String driverLicense, String memberShipLevel) {
        super(firstName, lastName, mobileNumber, email, address);
        this.driverLicense = driverLicense;
        this.memberShipLevel = memberShipLevel;
    }
    public String getDriverLicense() {
        return driverLicense;
    }
    public void setDriverLicense(String driverLicense) {
        this.driverLicense = driverLicense;
    }
    public String getMemberShipLevel() {
        return memberShipLevel;
    }
    public void setMemberShipLevel(String memberShipLevel) {
        this.memberShipLevel = memberShipLevel;
    }
}
