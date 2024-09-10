package org.example.interviewQuestions.parkingLot;

import org.example.interviewQuestions.parkingLot.parkingSpotManager.FourWheelerParkingSpotManager;
import org.example.interviewQuestions.parkingLot.parkingSpotManager.IParkingSpotManager;
import org.example.interviewQuestions.parkingLot.parkingSpotManager.TwoWheelerParkingSpotManager;

import java.util.ArrayList;
import java.util.List;

public class Floor {
    private int floorNumber;
    private List<IParkingSpotManager> parkingSpotManagers;

    public Floor(int floorNumber) {
        this.floorNumber = floorNumber;
        this.parkingSpotManagers = new ArrayList<>();
    }

    public void addParkingSpotManager(IParkingSpotManager manager) {
        parkingSpotManagers.add(manager);
    }

    public IParkingSpotManager getParkingSpotManager(VehicleType vehicleType) {
        for (IParkingSpotManager manager : parkingSpotManagers) {
            if (manager instanceof TwoWheelerParkingSpotManager && vehicleType == VehicleType.TWO_WHEELER) {
                return manager;
            } else if (manager instanceof FourWheelerParkingSpotManager && vehicleType == VehicleType.FOUR_WHEELER) {
                return manager;
            }
        }
        return null;
    }

    public int getFloorNumber() {
        return floorNumber;
    }
}
