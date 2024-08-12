package org.example.strategyDesignPattern.withFactoryMethod.factory;

import org.example.strategyDesignPattern.withFactoryMethod.CreditCardPaymentStrategy;
import org.example.strategyDesignPattern.withFactoryMethod.PaymentStrategy;

public class CreditCardPaymentStrategyFactory implements PaymentStrategyFactory{
    @Override
    public PaymentStrategy createPaymentStrategy() {
        return new CreditCardPaymentStrategy();
    }
}
