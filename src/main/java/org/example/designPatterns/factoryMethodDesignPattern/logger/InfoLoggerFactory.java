package org.example.designPatterns.factoryMethodDesignPattern.logger;

public class InfoLoggerFactory implements IloggerFactory{
    @Override
    public Ilogger createLogger() {
        return new InfoLogger();
    }
}
