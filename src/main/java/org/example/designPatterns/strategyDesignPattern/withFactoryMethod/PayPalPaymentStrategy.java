package org.example.designPatterns.strategyDesignPattern.withFactoryMethod;

public class PayPalPaymentStrategy implements PaymentStrategy {
    public void processPayment(double amount) {
        System.out.println("Payment made by PayPal: " + amount);
    }
}
