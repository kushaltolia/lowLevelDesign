package org.example.designPatterns.builderDesignPattern.withoutChaining;

public class DesktopDirector {
    // Association relationship with builder
    public Desktop buildDesktop(DesktopBuilder builder) {
        builder.buildStorage();
        builder.buildMemory();
        builder.buildProcessor();
        builder.buildMotherBoard();
        builder.buildGraphicsCard();
        return builder.getDesktop();
    }
}
