package org.example.designPatterns.builderDesignPattern.withChaining;

public class DesktopDirector {
    // Association relationship with builder
    public Desktop buildDesktop(DesktopBuilder builder) {
        return builder.buildMotherBoard().buildProcessor().buildMemory().buildStorage().buildGraphicsCard().getDesktop();
    }
}
