package org.example.interviewQuestions.parkingLot;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private List<Floor> floors;
    private List<EntranceGate> entranceGates;
    private List<ExitGate> exitGates;

    public ParkingLot() {
        floors = new ArrayList<>();
        entranceGates = new ArrayList<>();
        exitGates = new ArrayList<>();
    }

    public void addFloor(Floor floor) {
        floors.add(floor);
    }

    public void addEntranceGate(EntranceGate entranceGate) {
        entranceGates.add(entranceGate);
    }

    public void addExitGate(ExitGate exitGate) {
        exitGates.add(exitGate);
    }

    public List<EntranceGate> getEntranceGates() {
        return entranceGates;
    }

    public List<ExitGate> getExitGates() {
        return exitGates;
    }

    public Floor getFloor(int floorNumber) {
        for (Floor floor : floors) {
            if (floor.getFloorNumber() == floorNumber) {
                return floor;
            }
        }
        return null;
    }
}
