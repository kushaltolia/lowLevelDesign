package org.example.interviewQuestions.parkingLot.payment;


public class CashPayment implements IPayment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " in cash.");
    }
}
