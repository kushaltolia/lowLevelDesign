package org.example.designPatterns.strategyDesignPattern.withFactoryMethod.factory;

import org.example.designPatterns.strategyDesignPattern.withFactoryMethod.CryptoPaymentStartegy;
import org.example.designPatterns.strategyDesignPattern.withFactoryMethod.PaymentStrategy;

public class CryptoPaymentStrategyFactory implements PaymentStrategyFactory {
    @Override
    public PaymentStrategy createPaymentStrategy() {
        return new CryptoPaymentStartegy();
    }
}
