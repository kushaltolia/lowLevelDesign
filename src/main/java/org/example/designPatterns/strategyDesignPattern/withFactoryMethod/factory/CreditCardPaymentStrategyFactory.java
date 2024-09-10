package org.example.designPatterns.strategyDesignPattern.withFactoryMethod.factory;

import org.example.designPatterns.strategyDesignPattern.withFactoryMethod.CreditCardPaymentStrategy;
import org.example.designPatterns.strategyDesignPattern.withFactoryMethod.PaymentStrategy;

public class CreditCardPaymentStrategyFactory implements PaymentStrategyFactory{
    @Override
    public PaymentStrategy createPaymentStrategy() {
        return new CreditCardPaymentStrategy();
    }
}
