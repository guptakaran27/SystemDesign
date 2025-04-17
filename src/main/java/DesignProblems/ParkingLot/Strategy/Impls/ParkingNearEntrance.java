package main.java.DesignProblems.ParkingLot.Strategy.Impls;/*
 * @project DesignPattern
 * @author karan.k.gupta
 *
 */

import main.java.DesignProblems.ParkingLot.Pojos.ParkingSpot;
import main.java.DesignProblems.ParkingLot.Pojos.Vehicle;
import main.java.DesignProblems.ParkingLot.Strategy.ParkingStrategy;

import java.util.List;

public class ParkingNearEntrance implements ParkingStrategy {
    @Override
    public ParkingSpot findParkingSpot(List<ParkingSpot> parkingSpots, Vehicle vehicle) {
        return parkingSpots.stream()
                .filter(spot -> spot.isEmpty() && spot.getTypeOfSpot() == vehicle.getVehicleType())
                .findFirst()
                .orElseThrow(()-> new IllegalStateException("No Compatible Slots found for: " + vehicle.getVehicleType()));
    }
}
