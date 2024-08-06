package org.example.builderDesignPattern.withoutChaining;

public abstract class DesktopBuilder {
    protected Desktop desktop;
    abstract void buildMotherBoard();
    abstract void buildProcessor();
    abstract void buildMemory();
    abstract void buildStorage();
    abstract void buildGraphicsCard();
    public Desktop getDesktop() {
        return desktop;
    }
}
