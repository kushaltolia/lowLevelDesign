package org.example.commandDesignPattern;

public class Main {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();

        // Create devices
        Light livingRoomLight = new Light();
        Fan ceilingFan = new Fan();
        GarageDoor garageDoor = new GarageDoor();

        // Create commands
        Command lightOn = new LightOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);
        Command fanOn = new FanOnCommand(ceilingFan);
        Command fanOff = new FanOffCommand(ceilingFan);
        Command garageOpen = new GarageDoorOpen(garageDoor);
        Command garageClose = new GarageDoorClose(garageDoor);

        // Set commands to the remote control
        remote.setCommand(0, lightOn, lightOff);
        remote.setCommand(1, fanOn, fanOff);
        remote.setCommand(2, garageOpen, garageClose);

        // Test the commands
        remote.pressOnButton(0); // Light on
        remote.pressOffButton(0); // Light off
        remote.pressUndoButton(); // Undo, Light on

        remote.pressOnButton(1); // Fan on
        remote.pressOffButton(1); // Fan off
        remote.pressUndoButton(); // Undo, Fan on

        remote.pressOnButton(2); // Garage door open
        remote.pressOffButton(2); // Garage door close
        remote.pressUndoButton(); // Undo, Garage door open
    }
}
