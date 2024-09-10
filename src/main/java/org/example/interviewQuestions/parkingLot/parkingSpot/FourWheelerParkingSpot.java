package org.example.interviewQuestions.parkingLot.parkingSpot;

import lombok.Data;
import org.example.interviewQuestions.parkingLot.Vehicle;
import org.example.interviewQuestions.parkingLot.VehicleType;

@Data
public class FourWheelerParkingSpot implements IParkingSpot {
    private Vehicle vehicle;
    private final double price = 40;
    private int spotNumber;

    public FourWheelerParkingSpot(int spotNumber) {
        this.spotNumber = spotNumber;
    }

    @Override
    public boolean isFree() {
        return vehicle == null;
    }

    @Override
    public void parkVehicle(Vehicle vehicle) {
        if (vehicle.getVehicleType() == VehicleType.FOUR_WHEELER) {
            this.vehicle = vehicle;
        } else {
            throw new IllegalArgumentException("Cannot park a non-four-wheeler vehicle in a four-wheeler spot");
        }
    }

    @Override
    public void removeVehicle() {
        this.vehicle = null;
    }


    @Override
    public VehicleType getVehicleType() {
        return VehicleType.FOUR_WHEELER;
    }
}
