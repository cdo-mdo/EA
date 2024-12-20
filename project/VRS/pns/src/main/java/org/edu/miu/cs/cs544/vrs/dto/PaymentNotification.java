package org.edu.miu.cs.cs544.vrs.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

public class PaymentNotification implements Serializable {
    private Long id;
    private Double amount;
    private LocalDateTime paymentDate;
}
