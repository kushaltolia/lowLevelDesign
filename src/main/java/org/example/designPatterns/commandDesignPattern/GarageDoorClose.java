package org.example.designPatterns.commandDesignPattern;

public class GarageDoorClose implements Command {
    GarageDoor garageDoor;

    public GarageDoorClose(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    public void execute() {
        garageDoor.down();
    }

    public void undo() {
        garageDoor.up();
    }
}
