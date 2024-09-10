package org.example.interviewQuestions.parkingLot.pricingStrategy;

import org.example.interviewQuestions.parkingLot.parkingSpot.IParkingSpot;

public interface IPricingStrategy {
    double calculatePrice(IParkingSpot spot, long duration);
}
