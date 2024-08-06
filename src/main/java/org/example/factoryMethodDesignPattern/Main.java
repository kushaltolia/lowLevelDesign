package org.example.factoryMethodDesignPattern;

import org.example.factoryMethodDesignPattern.logger.DebugLoggerFactory;
import org.example.factoryMethodDesignPattern.logger.Ilogger;
import org.example.factoryMethodDesignPattern.logger.IloggerFactory;

public class Main {
    public static void main(String [] args) {
        IloggerFactory loggerFactory = new DebugLoggerFactory();
        Ilogger logger =  loggerFactory.createLogger();
        logger.log("Hello World");
    }
}
