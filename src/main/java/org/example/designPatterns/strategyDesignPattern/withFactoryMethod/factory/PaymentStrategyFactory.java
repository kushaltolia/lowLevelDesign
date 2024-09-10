package org.example.designPatterns.strategyDesignPattern.withFactoryMethod.factory;

import org.example.designPatterns.strategyDesignPattern.withFactoryMethod.PaymentStrategy;

public interface PaymentStrategyFactory {
    PaymentStrategy createPaymentStrategy();
}
