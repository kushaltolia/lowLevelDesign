package org.example.observerDesignPattern;

public class CallCenter implements Observer {
    private String name;
    public CallCenter(String name) {
        this.name = name;
    }
    @Override
    public void update(Order order) {
        System.out.println("Order with id: " + order.getId() + " is updated to status: " + order.getStatus() + " at CallCenter: " + name);
    }
}
