package org.example.designPatterns.abstractFactoryDesignPattern.ui;

public class MacFactory implements IFactory {
    @Override
    public IButton createButton() {
        return new MacButton();
    }

    @Override
    public ITextBox createTextBox() {
        return new MacTextBox();
    }
}
