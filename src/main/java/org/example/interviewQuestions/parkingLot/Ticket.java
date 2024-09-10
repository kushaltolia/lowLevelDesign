package org.example.interviewQuestions.parkingLot;

import lombok.Data;
import org.example.interviewQuestions.parkingLot.parkingSpot.IParkingSpot;

import java.time.LocalDateTime;

@Data
public class Ticket {
    private Vehicle vehicle;
    private IParkingSpot spot;
    private LocalDateTime entryTime;

    public Ticket(Vehicle vehicle, IParkingSpot spot, LocalDateTime entryTime) {
        this.vehicle = vehicle;
        this.spot = spot;
        this.entryTime = entryTime;
    }
}
