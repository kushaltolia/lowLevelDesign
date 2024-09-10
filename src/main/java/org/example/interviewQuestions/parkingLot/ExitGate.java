package org.example.interviewQuestions.parkingLot;

import org.example.interviewQuestions.parkingLot.payment.IPayment;
import org.example.interviewQuestions.parkingLot.payment.PaymentFactory;
import org.example.interviewQuestions.parkingLot.pricingStrategy.DefaultPricingStrategy;
import org.example.interviewQuestions.parkingLot.pricingStrategy.IPricingStrategy;
import org.example.interviewQuestions.parkingLot.pricingStrategy.TimeBasedPricingStrategy;

import java.time.Duration;
import java.time.LocalDateTime;

public class ExitGate {
    private int gateId;
    private Floor floor;

    public ExitGate(int gateId, Floor floor) {
        this.gateId = gateId;
        this.floor = floor;
    }

    public void exitVehicle(Ticket ticket, String paymentType, String pricingType) {
        LocalDateTime exitTime = LocalDateTime.now();
        long durationMinutes = Duration.between(ticket.getEntryTime(), exitTime).toMinutes();

        IPricingStrategy pricingStrategy;
        if ("timeBased".equalsIgnoreCase(pricingType)) {
            pricingStrategy = new TimeBasedPricingStrategy();
        } else {
            pricingStrategy = new DefaultPricingStrategy();
        }

        double amount = pricingStrategy.calculatePrice(ticket.getSpot(), durationMinutes);
        IPayment payment = PaymentFactory.getPayment(paymentType);
        payment.pay(amount);

        ticket.getSpot().removeVehicle();
    }
}

