package org.example.designPatterns.singletonDesignPattern;

public class DBConnector {
    private static DBConnector instance;

    private DBConnector() {
        // private constructor
        System.out.println("DBConnector instance created");
    }

    public static DBConnector getInstance() {
        if(instance == null) {
            synchronized (DBConnector.class) {
                if(instance == null) {
                    instance = new DBConnector();
                }
            }
        }
        return instance;
    }
}
