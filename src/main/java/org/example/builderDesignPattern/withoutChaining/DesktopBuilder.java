package org.example.builderDesignPattern.withoutChaining;

public interface  DesktopBuilder {
     void buildMotherBoard();
     void buildProcessor();
     void buildMemory();
     void buildStorage();
     void buildGraphicsCard();
     Desktop getDesktop();
}
