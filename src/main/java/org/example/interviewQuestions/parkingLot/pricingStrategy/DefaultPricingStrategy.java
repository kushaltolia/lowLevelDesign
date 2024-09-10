package org.example.interviewQuestions.parkingLot.pricingStrategy;

import org.example.interviewQuestions.parkingLot.parkingSpot.IParkingSpot;

public class DefaultPricingStrategy implements  IPricingStrategy{
    @Override
    public double calculatePrice(IParkingSpot spot, long duration) {
        return spot.getPrice();
    }
}
