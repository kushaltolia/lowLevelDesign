package org.example.strategyDesignPattern.withFactoryMethod.factory;

import org.example.strategyDesignPattern.withFactoryMethod.PayPalPaymentStrategy;
import org.example.strategyDesignPattern.withFactoryMethod.PaymentStrategy;

public class PayPalStrategyFactory implements PaymentStrategyFactory {
    @Override
    public PaymentStrategy createPaymentStrategy() {
        return new PayPalPaymentStrategy();
    }
}