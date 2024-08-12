package org.example.simpleFactoryDesignPattern;

import org.example.simpleFactoryDesignPattern.logger.Ilogger;
import org.example.simpleFactoryDesignPattern.logger.LogLevel;
import org.example.simpleFactoryDesignPattern.logger.LoggerFactory;

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
 