package org.example.observerDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private int id;
    private String status;
    private List<Observer> observers = new ArrayList<>();

    public Order(int id, String status) {
        this.id = id;
        this.status = status;
    }
    public int getId() {
        return id;
    }
    public String getStatus() {
        return status;
    }
    public void addObserver(Observer observer) {
        observers.add(observer);
    }
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    public void setStatus(String status) {
        this.status = status;
        notifyObservers();
    }
    public void notifyObservers() {
        for(Observer observer: observers) {
            observer.update(this);
        }
    }
}
