package org.edu.miu.cs.cs544.vrs.pns.controller;

import org.edu.miu.cs.cs544.vrs.dto.PaymentNotification;
import org.edu.miu.cs.cs544.vrs.pns.service.PaymentNotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/payments")
public class PaymentNotificationController {
    @Autowired
    private PaymentNotificationService paymentNotificationService;

    @PostMapping("/rental")
    public String sendRentalPaymentNotification(@RequestBody PaymentNotification paymentNotification) {
        paymentNotificationService.sendRentalPaymentNotification(paymentNotification);
        return "Rental Payment Notification Sent";
    }

    @PostMapping("/reservation")
    public String sendReservationPaymentNotification(@RequestBody PaymentNotification paymentNotification) {
        paymentNotificationService.sendReservationPaymentNotification(paymentNotification);
        return "Reservation Payment Notification Sent";
    }
}
