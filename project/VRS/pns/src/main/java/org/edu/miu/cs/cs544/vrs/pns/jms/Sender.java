package org.edu.miu.cs.cs544.vrs.pns.jms;

import jakarta.jms.ConnectionFactory;
import org.apache.activemq.artemis.jms.client.ActiveMQConnectionFactory;
import org.edu.miu.cs.cs544.vrs.dto.PaymentNotification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class Sender {
    @Autowired
    private JmsTemplate jmsTemplate;

    @Value("${spring.jms.message.queue.rental}")
    private String rentalQueueName;

    @Value("${spring.jms.message.queue.reservation}")
    private String reservationQueueName;

    public void sendRentalPaymentNotification(PaymentNotification paymentNotification) {
        jmsTemplate.convertAndSend(rentalQueueName, paymentNotification);
    }

    public void sendReservationPaymentNotification(PaymentNotification paymentNotification) {
        jmsTemplate.convertAndSend(reservationQueueName, paymentNotification);
    }
}
