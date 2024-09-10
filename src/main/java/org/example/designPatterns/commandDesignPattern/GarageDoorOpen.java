package org.example.designPatterns.commandDesignPattern;

public class GarageDoorOpen implements Command {
    GarageDoor garageDoor;

    public GarageDoorOpen(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    public void execute() {
        garageDoor.up();
    }

    public void undo() {
        garageDoor.down();
    }
}
