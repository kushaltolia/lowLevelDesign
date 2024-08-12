package org.example.strategyDesignPattern.withoutFactory;

public class CryptoPaymentStartegy implements PaymentStrategy{
    public void processPayment(double amount) {
        System.out.println("Payment made by Crypto: " + amount);
    }
}
