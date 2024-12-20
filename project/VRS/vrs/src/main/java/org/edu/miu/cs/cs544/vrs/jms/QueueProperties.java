package org.edu.miu.cs.cs544.vrs.jms;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class QueueProperties {
    @Value("${spring.jms.message.queue.rental}")
    private String rentalPaymentQueue;

    @Value("${spring.jms.message.queue.reservation}")
    private String reservationPaymentQueue;

    public String getRentalPaymentQueue() {
        return rentalPaymentQueue;
    }

    public void setRentalPaymentQueue(String rentalPaymentQueue) {
        this.rentalPaymentQueue = rentalPaymentQueue;
    }
    public String getReservationPaymentQueue() {
        return reservationPaymentQueue;
    }
    public void setReservationPaymentQueue(String reservationPaymentQueue) {
        this.reservationPaymentQueue = reservationPaymentQueue;
    }
}
