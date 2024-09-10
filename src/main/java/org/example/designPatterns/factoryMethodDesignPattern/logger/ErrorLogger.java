package org.example.designPatterns.factoryMethodDesignPattern.logger;

public class ErrorLogger implements  Ilogger{
    @Override
    public void log(String message) {
        System.out.println("Error log is : " + message);
    }
}
