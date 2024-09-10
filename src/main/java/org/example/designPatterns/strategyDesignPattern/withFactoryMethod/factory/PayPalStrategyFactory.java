package org.example.designPatterns.strategyDesignPattern.withFactoryMethod.factory;

import org.example.designPatterns.strategyDesignPattern.withFactoryMethod.PayPalPaymentStrategy;
import org.example.designPatterns.strategyDesignPattern.withFactoryMethod.PaymentStrategy;

public class PayPalStrategyFactory implements PaymentStrategyFactory {
    @Override
    public PaymentStrategy createPaymentStrategy() {
        return new PayPalPaymentStrategy();
    }
}