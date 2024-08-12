package org.example.strategyDesignPattern.withFactoryMethod;

import org.example.strategyDesignPattern.withFactoryMethod.factory.PayPalStrategyFactory;
import org.example.strategyDesignPattern.withFactoryMethod.factory.PaymentStrategyFactory;

public class Main {
    public static void main(String[] args) {
        PaymentStrategyFactory paymentStrategyFactory = new PayPalStrategyFactory();
        PaymentProcessor paymentProcessor = new PaymentProcessor(paymentStrategyFactory.createPaymentStrategy());
        paymentProcessor.processPayment(200);

    }
}
