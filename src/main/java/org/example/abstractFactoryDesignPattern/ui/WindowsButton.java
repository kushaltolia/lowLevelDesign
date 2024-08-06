package org.example.abstractFactoryDesignPattern.ui;

public class WindowsButton implements IButton {
    @Override
    public void press() {
        System.out.println("Windows button pressed");
    }
}
