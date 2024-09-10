package org.example.interviewQuestions.parkingLot.payment;

public class PaymentFactory {
    public static IPayment getPayment(String type) {
        return switch (type) {
            case "cash" -> new CashPayment();
            case "creditCard" -> new CreditCardPayment();
            default -> null;
        };
    }
}
