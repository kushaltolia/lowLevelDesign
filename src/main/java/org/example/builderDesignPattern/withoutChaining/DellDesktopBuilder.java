package org.example.builderDesignPattern.withoutChaining;

public class DellDesktopBuilder implements DesktopBuilder {
    private Desktop desktop;
    public DellDesktopBuilder() {
        desktop = new Desktop();
    }
    @Override
    public void buildMotherBoard() {
        desktop.setMotherBoard("Dell MotherBoard");
    }

    @Override
    public void buildProcessor() {
        desktop.setProcessor("Dell MotherBoard");
    }
    @Override
    public void buildStorage() {
        desktop.setStorage("Dell Storage");
    }
    @Override
    public void buildMemory() {
        desktop.setMemory("Dell Memory");
    }
    @Override
    public void buildGraphicsCard() {
        desktop.setGraphicsCard("Dell Graphics Card");
    }
    public Desktop getDesktop() {
        return desktop;
    }

}
