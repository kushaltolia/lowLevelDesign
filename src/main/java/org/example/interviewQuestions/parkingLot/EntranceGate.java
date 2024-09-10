package org.example.interviewQuestions.parkingLot;

import org.example.interviewQuestions.parkingLot.parkingSpot.IParkingSpot;
import org.example.interviewQuestions.parkingLot.parkingSpotManager.IParkingSpotManager;

import java.time.LocalDateTime;

public class EntranceGate {
    private int gateId;
    private Floor floor;

    public EntranceGate(int gateId, Floor floor) {
        this.gateId = gateId;
        this.floor = floor;
    }

    public Ticket enterVehicle(Vehicle vehicle) {
        IParkingSpotManager manager = floor.getParkingSpotManager(vehicle.getVehicleType());
        IParkingSpot spot = manager.findParkingSpot();

        if (spot != null && spot.isFree()) {
            spot.parkVehicle(vehicle);
            return new Ticket(vehicle, spot, LocalDateTime.now());
        }

        System.out.println("No parking spot available for vehicle: " + vehicle.getLicenseNumber());
        return null;
    }
}
