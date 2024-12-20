package org.edu.miu.cs.cs544.vrs.jms;

import org.edu.miu.cs.cs544.vrs.Entity.Payment;
import org.edu.miu.cs.cs544.vrs.Entity.PaymentType;
import org.edu.miu.cs.cs544.vrs.dto.PaymentNotification;
import org.edu.miu.cs.cs544.vrs.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
public class PaymentListener {
    @Autowired
    private QueueProperties queueProperties;

    @Autowired
    private JmsTemplate jmsTemplate;

    @Autowired
    private PaymentRepository paymentRepository;

    @JmsListener(destination = "#{@queueProperties.rentalPaymentQueue}", concurrency = "2")
    public void hanldeRentalPayment(PaymentNotification notification) {
        savePayment(notification, "RENTAL");
    }

    @JmsListener(destination = "#{@queueProperties.reservationPaymentQueue}", concurrency = "2")
    public void hanldeReservationPayment(PaymentNotification notification) {
        savePayment(notification, "RESERVATION");
    }

    private void savePayment(PaymentNotification notification, String type) {
        Payment payment = new Payment();
        payment.setReceiptNumber(notification.getReceiptNumber());
        payment.setAmount(notification.getAmount());
        payment.setPaymentDate(notification.getPaymentDate());
        payment.setPaymentType(PaymentType.valueOf(notification.getType()));
        paymentRepository.save(payment);
    }
}
