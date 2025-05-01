package main.java.design.problems.parking.strategy.Impls;/*
 * @project DesignPattern
 * @author karan.k.gupta
 *
 */

import main.java.design.problems.parking.dao.ParkingSpot;
import main.java.design.problems.parking.strategy.ParkingStrategy;

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
