package org.example.interviewQuestions.parkingLot.payment;

public class CreditCardPayment implements  IPayment{
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using credit card.");
    }
}
