package org.example.abstractFactoryDesignPattern;

import org.example.abstractFactoryDesignPattern.ui.IButton;
import org.example.abstractFactoryDesignPattern.ui.IFactory;
import org.example.abstractFactoryDesignPattern.ui.ITextBox;
import org.example.abstractFactoryDesignPattern.ui.MacFactory;

public class Main {
    public static void main(String args[]) {
        IFactory factory = new MacFactory();
        IButton button = factory.createButton();
        button.press();
        ITextBox textBox = factory.createTextBox();
        textBox.setText();
    }
}
