package org.example.designPatterns.abstractFactoryDesignPattern.ui;

public class WindowsTextBox implements ITextBox {
    @Override
    public void setText() {
        System.out.println("Windows text box set");
    }
}
