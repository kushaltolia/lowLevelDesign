package org.example.strategyDesignPattern.withFactoryMethod.factory;

import org.example.strategyDesignPattern.withFactoryMethod.PaymentStrategy;

public interface PaymentStrategyFactory {
    PaymentStrategy createPaymentStrategy();
}
