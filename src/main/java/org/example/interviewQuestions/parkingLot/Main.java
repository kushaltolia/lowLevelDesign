package org.example.interviewQuestions.parkingLot;

import org.example.interviewQuestions.parkingLot.parkingSpot.FourWheelerParkingSpot;
import org.example.interviewQuestions.parkingLot.parkingSpot.TwoWheelerParkingSpot;
import org.example.interviewQuestions.parkingLot.parkingSpotManager.FourWheelerParkingSpotManager;
import org.example.interviewQuestions.parkingLot.parkingSpotManager.TwoWheelerParkingSpotManager;

public class Main {
    public static void main(String[] args) {
        // Creating Parking Lot
        ParkingLot parkingLot = new ParkingLot();

        // Creating Floors
        Floor floor1 = new Floor(1);
        Floor floor2 = new Floor(2);

        // Adding floors to parking lot
        parkingLot.addFloor(floor1);
        parkingLot.addFloor(floor2);

        // Create parking managers for each floor
        TwoWheelerParkingSpotManager twoWheelerManagerFloor1 = new TwoWheelerParkingSpotManager();
        FourWheelerParkingSpotManager fourWheelerManagerFloor1 = new FourWheelerParkingSpotManager();

        TwoWheelerParkingSpotManager twoWheelerManagerFloor2 = new TwoWheelerParkingSpotManager();
        FourWheelerParkingSpotManager fourWheelerManagerFloor2 = new FourWheelerParkingSpotManager();

        // Add parking spots to each manager
        twoWheelerManagerFloor1.addParkingSpot(new TwoWheelerParkingSpot(101));
        fourWheelerManagerFloor1.addParkingSpot(new FourWheelerParkingSpot(102));

        twoWheelerManagerFloor2.addParkingSpot(new TwoWheelerParkingSpot(201));
        fourWheelerManagerFloor2.addParkingSpot(new FourWheelerParkingSpot(202));

        // Add parking managers to floors
        floor1.addParkingSpotManager(twoWheelerManagerFloor1);
        floor1.addParkingSpotManager(fourWheelerManagerFloor1);

        floor2.addParkingSpotManager(twoWheelerManagerFloor2);
        floor2.addParkingSpotManager(fourWheelerManagerFloor2);

        // Create multiple entrance and exit gates
        EntranceGate entranceGate1 = new EntranceGate(1, floor1);
        EntranceGate entranceGate2 = new EntranceGate(2, floor2);

        ExitGate exitGate1 = new ExitGate(1, floor1);
        ExitGate exitGate2 = new ExitGate(2, floor2);

        // Add gates to parking lot
        parkingLot.addEntranceGate(entranceGate1);
        parkingLot.addEntranceGate(entranceGate2);

        parkingLot.addExitGate(exitGate1);
        parkingLot.addExitGate(exitGate2);

        // Vehicle enters through gate 1 on floor 1
        Vehicle bike = new Vehicle("BIKE123", VehicleType.TWO_WHEELER);
        Ticket ticket = entranceGate1.enterVehicle(bike);

        // Simulate vehicle exiting through gate 1
        if (ticket != null) {
            exitGate1.exitVehicle(ticket, "cash", "default");
        }

        // Another vehicle enters through gate 2 on floor 2
        Vehicle car = new Vehicle("CAR123", VehicleType.FOUR_WHEELER);
        Ticket ticketCar = entranceGate2.enterVehicle(car);

        // Simulate vehicle exiting through gate 2
        if (ticketCar != null) {
            exitGate2.exitVehicle(ticketCar, "creditCard", "default");
        }
    }
}
