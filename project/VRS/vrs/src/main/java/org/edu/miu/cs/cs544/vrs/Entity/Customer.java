package org.edu.miu.cs.cs544.vrs.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Customer extends Person {
    private String driverLicenseNumber;
    private MembershipLevel membershipLevel;

    @OneToMany (mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Reservation> reservations;

    @OneToMany (mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Rental> rentals;

    public Customer() {
        super();
    }

    public Customer(String name, String mobileNumber, String email,
                    String driverLicenseNumber, MembershipLevel membershipLevel) {
        super(name, mobileNumber, email);
        this.driverLicenseNumber = driverLicenseNumber;
        this.membershipLevel = membershipLevel;
    }

    public String getDriverLicenseNumber() {
        return driverLicenseNumber;
    }
    public void setDriverLicenseNumber(String driverLicenseNumber) {
        this.driverLicenseNumber = driverLicenseNumber;
    }
    public MembershipLevel getMembershipLevel() {
        return membershipLevel;
    }
    public void setMembershipLevel(MembershipLevel membershipLevel) {
        this.membershipLevel = membershipLevel;
    }
}
