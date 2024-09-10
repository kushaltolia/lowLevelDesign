package org.example.designPatterns.abstractFactoryDesignPattern.ui;

public class MacButton implements IButton {
    @Override
    public void press() {
        System.out.println("Mac button pressed");
    }
}
