package org.example.abstractFactoryDesignPattern.ui;

public interface IFactory {
    IButton createButton();
    ITextBox createTextBox();
}
