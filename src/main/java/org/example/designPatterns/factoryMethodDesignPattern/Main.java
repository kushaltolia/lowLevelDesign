package org.example.designPatterns.factoryMethodDesignPattern;

import org.example.designPatterns.factoryMethodDesignPattern.logger.DebugLoggerFactory;
import org.example.designPatterns.factoryMethodDesignPattern.logger.Ilogger;
import org.example.designPatterns.factoryMethodDesignPattern.logger.IloggerFactory;

public class Main {
    public static void main(String [] args) {
        IloggerFactory loggerFactory = new DebugLoggerFactory();
        Ilogger logger =  loggerFactory.createLogger();
        logger.log("Hello World");
    }
}
