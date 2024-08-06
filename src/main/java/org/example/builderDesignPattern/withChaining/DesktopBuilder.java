package org.example.builderDesignPattern.withChaining;

public abstract class DesktopBuilder {
    protected Desktop desktop;
    abstract DesktopBuilder buildMotherBoard();
    abstract DesktopBuilder buildProcessor();
    abstract DesktopBuilder buildMemory();
    abstract DesktopBuilder buildStorage();
    abstract DesktopBuilder buildGraphicsCard();
    public Desktop getDesktop() {
        return desktop;
    }
}
