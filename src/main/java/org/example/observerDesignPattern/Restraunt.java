package org.example.observerDesignPattern;

public class Restraunt implements  Observer {
    private String name;
    public Restraunt(String name) {
        this.name = name;
    }
    @Override
    public void update(Order order) {
        System.out.println("Order with id: " + order.getId() + " is updated to status: " + order.getStatus() + " at Restraunt: " + name);
    }
}
