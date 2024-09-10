package org.example.designPatterns.abstractFactoryDesignPattern.ui;

public interface IFactory {
    IButton createButton();
    ITextBox createTextBox();
}
