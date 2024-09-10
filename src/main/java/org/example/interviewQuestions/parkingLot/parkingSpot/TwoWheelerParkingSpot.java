package org.example.interviewQuestions.parkingLot.parkingSpot;

import org.example.interviewQuestions.parkingLot.Vehicle;
import org.example.interviewQuestions.parkingLot.VehicleType;

public class TwoWheelerParkingSpot implements IParkingSpot {
    private Vehicle vehicle;
    private final double price = 20;
    private final int spotNumber;

    public TwoWheelerParkingSpot(int spotNumber) {
        this.spotNumber = spotNumber;
    }

    @Override
    public boolean isFree() {
        return vehicle == null;
    }

    @Override
    public void parkVehicle(Vehicle vehicle) {
        if (vehicle.getVehicleType() == VehicleType.TWO_WHEELER) {
            this.vehicle = vehicle;
        } else {
            throw new IllegalArgumentException("Cannot park a non-two-wheeler vehicle in a two-wheeler spot");
        }
    }

    @Override
    public void removeVehicle() {
        this.vehicle = null;
    }

    @Override
    public Vehicle getVehicle() {
        return this.vehicle;
    }

    @Override
    public VehicleType getVehicleType() {
        return VehicleType.TWO_WHEELER;
    }

    @Override
    public int getSpotNumber() {
        return spotNumber;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
