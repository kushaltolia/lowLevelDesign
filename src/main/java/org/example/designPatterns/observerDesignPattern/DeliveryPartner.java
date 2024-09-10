package org.example.designPatterns.observerDesignPattern;

public class DeliveryPartner implements Observer{
    private String name;
    public DeliveryPartner(String name) {
        this.name = name;
    }
    @Override
    public void update(Order order) {
        System.out.println("Order with id: " + order.getId() + " is updated to status: " + order.getStatus() + " at DeliveryPartner: " + name);
    }
}
