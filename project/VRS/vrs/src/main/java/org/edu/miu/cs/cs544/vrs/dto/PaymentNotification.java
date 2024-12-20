package org.edu.miu.cs.cs544.vrs.dto;

import org.edu.miu.cs.cs544.vrs.Entity.PaymentType;

import java.io.Serializable;
import java.time.LocalDateTime;

public class PaymentNotification implements Serializable {
    private Long id;
    private String receiptNumber;
    private Double amount;
    private LocalDateTime paymentDate;
    private String type;

    public String getReceiptNumber() {
        return receiptNumber;
    }
    public void setReceiptNumber(String receiptNumber) {
        this.receiptNumber = receiptNumber;
    }
    public Double getAmount() {
        return amount;
    }
    public void setAmount(Double amount) {
        this.amount = amount;
    }
    public LocalDateTime getPaymentDate() {
        return paymentDate;
    }
    public void setPaymentDate(LocalDateTime paymentDate) {
        this.paymentDate = paymentDate;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
}
