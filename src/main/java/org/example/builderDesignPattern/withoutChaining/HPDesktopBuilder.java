package org.example.builderDesignPattern.withoutChaining;

public class HPDesktopBuilder extends DesktopBuilder {
    HPDesktopBuilder() {
        desktop = new Desktop();
    }
    @Override
    public void buildMotherBoard() {
        desktop.setMotherBoard("HP MotherBoard");
    }

    @Override
    public void buildProcessor() {
        desktop.setProcessor("HP MotherBoard");
    }
    @Override
    public void buildStorage() {
        desktop.setStorage("HP Storage");
    }
    @Override
    public void buildMemory() {
        desktop.setMemory("HP Memory");
    }
    @Override
    public void buildGraphicsCard() {
        desktop.setGraphicsCard("HP Graphics Card");
    }

}
