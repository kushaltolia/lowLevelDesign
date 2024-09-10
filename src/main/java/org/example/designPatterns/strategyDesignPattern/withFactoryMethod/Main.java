package org.example.designPatterns.strategyDesignPattern.withFactoryMethod;

import org.example.designPatterns.strategyDesignPattern.withFactoryMethod.factory.PayPalStrategyFactory;
import org.example.designPatterns.strategyDesignPattern.withFactoryMethod.factory.PaymentStrategyFactory;

public class Main {
    public static void main(String[] args) {
        PaymentStrategyFactory paymentStrategyFactory = new PayPalStrategyFactory();
        PaymentProcessor paymentProcessor = new PaymentProcessor(paymentStrategyFactory.createPaymentStrategy());
        paymentProcessor.processPayment(200);

    }
}
