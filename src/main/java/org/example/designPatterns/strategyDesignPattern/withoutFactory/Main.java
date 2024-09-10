package org.example.designPatterns.strategyDesignPattern.withoutFactory;

public class Main {
    public static void main(String[] args) {
        PaymentStrategy paymentStrategy = new PayPalPaymentStrategy();
        PaymentProcessor paymentProcessor = new PaymentProcessor(paymentStrategy);
        paymentProcessor.processPayment(100);

        paymentStrategy = new CryptoPaymentStartegy();
        paymentProcessor = new PaymentProcessor(paymentStrategy);
        paymentProcessor.processPayment(200);

        paymentStrategy = new CreditCardPaymentStrategy();
        paymentProcessor = new PaymentProcessor(paymentStrategy);
        paymentProcessor.processPayment(300);

    }
}
