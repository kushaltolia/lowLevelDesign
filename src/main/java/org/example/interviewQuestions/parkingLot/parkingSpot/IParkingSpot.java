package org.example.interviewQuestions.parkingLot.parkingSpot;

import org.example.interviewQuestions.parkingLot.Vehicle;
import org.example.interviewQuestions.parkingLot.VehicleType;

public interface IParkingSpot {
    boolean isFree();
    void parkVehicle(Vehicle vehicle);
    void removeVehicle();
    Vehicle getVehicle();
    VehicleType getVehicleType();
    int getSpotNumber();
    double getPrice();
}

