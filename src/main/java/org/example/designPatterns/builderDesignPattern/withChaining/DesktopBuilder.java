package org.example.designPatterns.builderDesignPattern.withChaining;

public interface DesktopBuilder {
     DesktopBuilder buildMotherBoard();
     DesktopBuilder buildProcessor();
     DesktopBuilder buildMemory();
     DesktopBuilder buildStorage();
     DesktopBuilder buildGraphicsCard();
     Desktop getDesktop();
}
