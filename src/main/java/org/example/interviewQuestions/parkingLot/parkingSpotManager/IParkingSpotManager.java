package org.example.interviewQuestions.parkingLot.parkingSpotManager;

import org.example.interviewQuestions.parkingLot.parkingSpot.IParkingSpot;

public interface IParkingSpotManager {
    IParkingSpot findParkingSpot();
    void addParkingSpot(IParkingSpot parkingSpot);
}
