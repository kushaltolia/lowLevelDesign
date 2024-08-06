package org.example.factoryMethodDesignPattern.logger;

public class InfoLoggerFactory implements IloggerFactory{
    @Override
    public Ilogger createLogger() {
        return new InfoLogger();
    }
}
