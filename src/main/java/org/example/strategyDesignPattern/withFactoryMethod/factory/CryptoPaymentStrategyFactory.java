package org.example.strategyDesignPattern.withFactoryMethod.factory;

import org.example.strategyDesignPattern.withFactoryMethod.CryptoPaymentStartegy;
import org.example.strategyDesignPattern.withFactoryMethod.PaymentStrategy;

public class CryptoPaymentStrategyFactory implements PaymentStrategyFactory {
    @Override
    public PaymentStrategy createPaymentStrategy() {
        return new CryptoPaymentStartegy();
    }
}
