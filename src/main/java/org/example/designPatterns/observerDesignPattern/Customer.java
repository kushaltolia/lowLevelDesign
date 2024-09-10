package org.example.designPatterns.observerDesignPattern;

public class Customer implements Observer{
    private String name;
    public Customer(String name) {
        this.name = name;
    }
    @Override
    public void update(Order order) {
        System.out.println("Order with id: " + order.getId() + " is updated to status: " + order.getStatus() + " at Customer: " + name);
    }
}
