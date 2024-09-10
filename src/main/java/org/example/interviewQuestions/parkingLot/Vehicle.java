package org.example.interviewQuestions.parkingLot;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Vehicle {
    private String licenseNumber;
    private VehicleType vehicleType;
}
