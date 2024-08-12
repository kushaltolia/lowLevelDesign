package org.example.strategyDesignPattern.withSimpleFactory;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor(PaymentStrategyFactory.getPaymentStrategy("PayPal"));
        paymentProcessor.processPayment(100);

        paymentProcessor = new PaymentProcessor(PaymentStrategyFactory.getPaymentStrategy("Crypto"));
        paymentProcessor.processPayment(200);

        paymentProcessor = new PaymentProcessor(PaymentStrategyFactory.getPaymentStrategy("CreditCard"));
        paymentProcessor.processPayment(300);

    }
}
