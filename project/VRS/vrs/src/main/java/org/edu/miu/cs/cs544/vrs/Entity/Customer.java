package org.edu.miu.cs.cs544.vrs.Entity;

import jakarta.persistence.Entity;

@Entity
public class Customer extends Person {
    private String driverLicenseNumber;
    private String membershipLevel;
}
