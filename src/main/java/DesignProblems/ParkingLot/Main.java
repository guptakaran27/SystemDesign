package main.java.DesignProblems.ParkingLot;

import main.java.DesignProblems.ParkingLot.Enums.VehicleType;
import main.java.DesignProblems.ParkingLot.Pojos.ParkingSpot;
import main.java.DesignProblems.ParkingLot.Pojos.Receipt;
import main.java.DesignProblems.ParkingLot.Pojos.Ticket;
import main.java.DesignProblems.ParkingLot.Pojos.Vehicle;
import main.java.DesignProblems.ParkingLot.Service.ParkingService;
import main.java.DesignProblems.ParkingLot.Service.TicketingService;
import main.java.DesignProblems.ParkingLot.Strategy.Impls.HourlyPricing;
import main.java.DesignProblems.ParkingLot.Strategy.Impls.ParkingNearEntrance;

import java.util.Arrays;

/**
 * @author Karan Gupta
 */
public class Main {
    public static void main(String[] args) {


        // Create Vehicles
        Vehicle car = new Vehicle("UP21AR0640", VehicleType.FOUR_WHEELER);
        Vehicle bike = new Vehicle("UP21BX9591", VehicleType.TWO_WHEELER);

        // Create Parking Slots
        ParkingSpot p1 = new ParkingSpot(1, VehicleType.TWO_WHEELER);
        ParkingSpot p2 = new ParkingSpot(2, VehicleType.FOUR_WHEELER);

        ParkingService parkingService = new ParkingService(Arrays.asList(p1,p2));

        System.out.println("\nAvailable Parking Spots: " + parkingService.getAvailableSlots());
        System.out.println();

        // Car arrives for parking
        ParkingSpot selectedSpot = parkingService.findParkingSpot(new ParkingNearEntrance(), car);
        Ticket ticketGeneratedForCar = parkingService.parkVehicle(car,selectedSpot, new HourlyPricing());

        // Exit time
        Receipt parkingReceipt = parkingService.unparkVehicle(ticketGeneratedForCar);
        System.out.println(parkingReceipt.toString());

        //parkingService.addParkingSpot(3,VehicleType.FOUR_WHEELER);
    }
}
