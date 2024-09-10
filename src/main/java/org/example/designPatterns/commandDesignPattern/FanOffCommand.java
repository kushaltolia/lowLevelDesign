package org.example.designPatterns.commandDesignPattern;

public class FanOffCommand implements Command {
    Fan fan;

    public FanOffCommand(Fan fan) {
        this.fan = fan;
    }

    public void execute() {
        fan.off();
    }

    public void undo() {
        fan.on();
    }
}
