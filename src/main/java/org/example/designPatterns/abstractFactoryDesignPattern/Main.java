package org.example.designPatterns.abstractFactoryDesignPattern;

import org.example.designPatterns.abstractFactoryDesignPattern.ui.IButton;
import org.example.designPatterns.abstractFactoryDesignPattern.ui.IFactory;
import org.example.designPatterns.abstractFactoryDesignPattern.ui.ITextBox;
import org.example.designPatterns.abstractFactoryDesignPattern.ui.MacFactory;

public class Main {
    public static void main(String args[]) {
        IFactory factory = new MacFactory();
        IButton button = factory.createButton();
        button.press();
        ITextBox textBox = factory.createTextBox();
        textBox.setText();
    }
}
