package org.edu.miu.cs.cs544.vrs.pns.service;

import org.edu.miu.cs.cs544.vrs.dto.PaymentNotification;
import org.edu.miu.cs.cs544.vrs.pns.jms.Sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentNotificationService {
    @Autowired
    private Sender sender;

    public void sendRentalPaymentNotification(PaymentNotification pn) {
        sender.sendRentalPaymentNotification(pn);
    }

    public void sendReservationPaymentNotification(PaymentNotification pn) {
        sender.sendReservationPaymentNotification(pn);
    }
}
