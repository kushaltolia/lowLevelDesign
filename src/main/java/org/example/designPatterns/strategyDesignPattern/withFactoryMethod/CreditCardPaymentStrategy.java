package org.example.designPatterns.strategyDesignPattern.withFactoryMethod;

public class CreditCardPaymentStrategy implements PaymentStrategy {
    public void processPayment(double amount) {
        System.out.println("Payment made by Credit Card: " + amount);
    }
}
