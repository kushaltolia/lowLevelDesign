package org.example.designPatterns.simpleFactoryDesignPattern.logger;

public class DebugLogger implements Ilogger{
    @Override
    public void log(String message) {
        System.out.println("Debug log is : " + message);
    }
}
