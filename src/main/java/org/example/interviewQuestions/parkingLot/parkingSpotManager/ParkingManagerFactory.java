package org.example.interviewQuestions.parkingLot.parkingSpotManager;

import org.example.interviewQuestions.parkingLot.VehicleType;

public class ParkingManagerFactory {
    public static IParkingSpotManager getManager(VehicleType vehicleType) {
        if (vehicleType == VehicleType.TWO_WHEELER) {
            return new TwoWheelerParkingSpotManager();
        } else if (vehicleType == VehicleType.FOUR_WHEELER) {
            return new FourWheelerParkingSpotManager();
        }
        return null;
    }
}
