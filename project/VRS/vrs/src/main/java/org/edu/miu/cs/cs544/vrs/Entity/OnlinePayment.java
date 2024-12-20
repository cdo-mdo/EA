package org.edu.miu.cs.cs544.vrs.Entity;

import jakarta.persistence.Entity;

@Entity
public class OnlinePayment extends Payment {
    private String transactionId;
    private String platform;
}
