package org.example.designPatterns.builderDesignPattern.withoutChaining;


public class Main {
    public static void main(String args[]) {
        DesktopDirector desktopDirector = new DesktopDirector();

        DellDesktopBuilder dellDesktopBuilder = new DellDesktopBuilder();
        Desktop dellDesktop = desktopDirector.buildDesktop(dellDesktopBuilder);
        dellDesktop.display();

        HPDesktopBuilder hpDesktopBuilder = new HPDesktopBuilder();
        Desktop hpDesktop = desktopDirector.buildDesktop(hpDesktopBuilder);
        hpDesktop.display();

    }
}
