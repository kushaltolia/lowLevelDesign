package org.example.strategyDesignPattern.withSimpleFactory;

public class PaymentStrategyFactory {
    public static PaymentStrategy getPaymentStrategy(String paymentType) {
        if (paymentType == null) {
            return null;
        }
        if (paymentType.equalsIgnoreCase("PayPal")) {
            return new PayPalPaymentStrategy();
        } else if (paymentType.equalsIgnoreCase("Crypto")) {
            return new CryptoPaymentStartegy();
        } else if (paymentType.equalsIgnoreCase("CreditCard")) {
            return new CreditCardPaymentStrategy();
        }
        return null;
    }
}
