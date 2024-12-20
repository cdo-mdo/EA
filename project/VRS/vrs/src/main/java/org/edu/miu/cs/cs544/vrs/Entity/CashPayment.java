package org.edu.miu.cs.cs544.vrs.Entity;

import jakarta.persistence.Entity;

@Entity
public class CashPayment extends Payment{
    private String receiptNumber;
}
