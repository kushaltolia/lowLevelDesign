package org.example.designPatterns.observerDesignPattern;

public class Main {
    public static void main(String [] args) {
        Order order = new Order(1, "Order Placed");
        Restraunt restraunt1 = new Restraunt("Restraunt 1");
        DeliveryPartner deliveryPartner1 = new DeliveryPartner("Delivery Partner 1");
        Customer customer = new Customer("Customer 1");
        CallCenter callCenter = new CallCenter("Call Center 1");
        order.addObserver(callCenter);
        order.addObserver(customer);
        order.addObserver(restraunt1);
        order.setStatus("Order Confirmed");
        order.setStatus("Order is being Prepared");
        order.addObserver(deliveryPartner1);
        order.setStatus("Order is Ready to pick up");
        order.setStatus("Order Out for Delivery");
        order.removeObserver(deliveryPartner1);
        order.setStatus("Feedback of food received");


    }
}
