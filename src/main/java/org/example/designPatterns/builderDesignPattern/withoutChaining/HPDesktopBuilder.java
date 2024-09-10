package org.example.designPatterns.builderDesignPattern.withoutChaining;

public class HPDesktopBuilder implements DesktopBuilder {
    private Desktop desktop;
        public HPDesktopBuilder() {
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
    public Desktop getDesktop() {
        return desktop;
    }

}
