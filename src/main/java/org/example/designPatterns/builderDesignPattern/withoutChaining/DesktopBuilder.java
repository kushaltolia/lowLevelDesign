package org.example.designPatterns.builderDesignPattern.withoutChaining;

public interface  DesktopBuilder {
     void buildMotherBoard();
     void buildProcessor();
     void buildMemory();
     void buildStorage();
     void buildGraphicsCard();
     Desktop getDesktop();
}
