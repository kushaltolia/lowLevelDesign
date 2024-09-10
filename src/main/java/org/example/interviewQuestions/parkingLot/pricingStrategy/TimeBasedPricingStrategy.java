package org.example.interviewQuestions.parkingLot.pricingStrategy;

import org.example.interviewQuestions.parkingLot.parkingSpot.IParkingSpot;

public class TimeBasedPricingStrategy implements IPricingStrategy {
    @Override
    public double calculatePrice(IParkingSpot spot, long durationMinutes) {
        return (spot.getPrice() / 60) * durationMinutes;
    }
}
