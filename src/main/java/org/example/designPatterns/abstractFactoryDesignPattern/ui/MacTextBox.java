package org.example.designPatterns.abstractFactoryDesignPattern.ui;

public class MacTextBox implements ITextBox {
    @Override
    public void setText() {
        System.out.println("Mac text box written");
    }
}
