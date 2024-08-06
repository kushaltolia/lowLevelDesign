package org.example.factoryMethodDesignPattern.logger;

public class DebugLoggerFactory implements IloggerFactory{
    @Override
    public Ilogger createLogger() {
        return new DebugLogger();
    }
}
