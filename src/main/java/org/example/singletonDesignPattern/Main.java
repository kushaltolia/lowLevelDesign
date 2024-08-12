package org.example.singletonDesignPattern;

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            DBConnector dbConnector1 = DBConnector.getInstance();
        });
        Thread thread2 = new Thread(() -> {
            DBConnector dbConnector1 = DBConnector.getInstance();
        });
        thread1.start();
        thread2.start();
    }
}
