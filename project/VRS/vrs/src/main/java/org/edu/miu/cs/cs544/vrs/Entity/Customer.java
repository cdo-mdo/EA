package org.edu.miu.cs.cs544.vrs.Entity;

import jakarta.persistence.Entity;

@Entity
public class Customer extends Person {
    private String driverLicenseNumber;
    private MembershipLevel membershipLevel;

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
