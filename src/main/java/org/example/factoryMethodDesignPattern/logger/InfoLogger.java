package org.example.factoryMethodDesignPattern.logger;


public class InfoLogger implements Ilogger {
    @Override
    public void log(String message) {
        System.out.println("Info log is : " + message);
    }
}