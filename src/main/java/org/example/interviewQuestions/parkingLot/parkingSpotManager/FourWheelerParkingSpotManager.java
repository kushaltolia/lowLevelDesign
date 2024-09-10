package org.example.interviewQuestions.parkingLot.parkingSpotManager;

import org.example.interviewQuestions.parkingLot.parkingSpot.IParkingSpot;

import java.util.ArrayList;
import java.util.List;

public class FourWheelerParkingSpotManager implements IParkingSpotManager {

    private List<IParkingSpot> spots = new ArrayList<>();

    @Override
    public IParkingSpot findParkingSpot() {
        for (IParkingSpot spot : spots) {
            if (spot.isFree()) {
                return spot;
            }
        }
        return null;
    }

    @Override
    public void addParkingSpot(IParkingSpot spot) {
        spots.add(spot);
    }
}
