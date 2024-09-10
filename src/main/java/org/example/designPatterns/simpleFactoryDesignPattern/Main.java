package org.example.designPatterns.simpleFactoryDesignPattern;

import org.example.designPatterns.simpleFactoryDesignPattern.logger.LogLevel;
import org.example.designPatterns.simpleFactoryDesignPattern.logger.LoggerFactory;
import org.example.designPatterns.simpleFactoryDesignPattern.logger.Ilogger;

public class Main {
    public static void main(String [] args) {
        Ilogger debugLogger = LoggerFactory.createLogger(LogLevel.DEBUG);
        debugLogger.log("This is a debug message");
        Ilogger infoLogger = LoggerFactory.createLogger(LogLevel.INFO);
        infoLogger.log("This is an info message");
        Ilogger errorLogger = LoggerFactory.createLogger(LogLevel.ERROR);
        errorLogger.log("This is an error message");
    }
}
