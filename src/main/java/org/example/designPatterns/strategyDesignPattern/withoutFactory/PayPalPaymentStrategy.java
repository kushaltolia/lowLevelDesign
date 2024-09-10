package org.example.designPatterns.strategyDesignPattern.withoutFactory;

public class PayPalPaymentStrategy implements PaymentStrategy{
    public void processPayment(double amount) {
        System.out.println("Payment made by PayPal: " + amount);
    }
}
