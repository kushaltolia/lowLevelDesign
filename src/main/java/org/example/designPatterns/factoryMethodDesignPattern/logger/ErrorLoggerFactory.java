package org.example.designPatterns.factoryMethodDesignPattern.logger;

public class ErrorLoggerFactory implements IloggerFactory{
    @Override
    public Ilogger createLogger() {
       return new ErrorLogger();
    }
}
