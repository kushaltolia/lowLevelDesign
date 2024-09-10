package org.example.designPatterns.builderDesignPattern.withChaining;

public class HPDesktopBuilder implements DesktopBuilder {
    private Desktop desktop;
    public HPDesktopBuilder() {
        desktop = new Desktop();
    }
    @Override
    public DesktopBuilder buildMotherBoard() {
        desktop.setMotherBoard("HP MotherBoard");
        return this;
    }

    @Override
    public DesktopBuilder buildProcessor() {
        desktop.setProcessor("HP MotherBoard");
        return this;
    }
    @Override
    public DesktopBuilder buildStorage() {
        desktop.setStorage("HP Storage");
        return this;
    }
    @Override
    public DesktopBuilder buildMemory() {
        desktop.setMemory("HP Memory");
        return this;
    }
    @Override
    public DesktopBuilder buildGraphicsCard() {
        desktop.setGraphicsCard("HP Graphics Card");
        return this;
    }
    @Override
    public Desktop getDesktop() {
        return desktop;
    }
}
