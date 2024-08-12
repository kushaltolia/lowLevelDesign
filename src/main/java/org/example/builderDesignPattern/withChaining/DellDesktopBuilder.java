package org.example.builderDesignPattern.withChaining;

public class DellDesktopBuilder implements DesktopBuilder {
    private Desktop desktop;
    public DellDesktopBuilder() {
        desktop = new Desktop();
    }
    @Override
    public DesktopBuilder buildMotherBoard() {
        desktop.setMotherBoard("Dell MotherBoard");
        return this;
    }

    @Override
    public DesktopBuilder buildProcessor() {
        desktop.setProcessor("Dell MotherBoard");
        return this;
    }
    @Override
    public DesktopBuilder buildStorage() {
        desktop.setStorage("Dell Storage");
        return this;
    }
    @Override
    public DesktopBuilder buildMemory() {
        desktop.setMemory("Dell Memory");
        return this;
    }
    @Override
    public DesktopBuilder buildGraphicsCard() {
        desktop.setGraphicsCard("Dell Graphics Card");
        return this;
    }
    @Override
    public Desktop getDesktop() {
        return desktop;
    }

}
