package main.java.design.problems.parking.strategy.Impls;/*
 * @project DesignPattern
 * @author karan.k.gupta
 *
 */

import main.java.design.problems.parking.dao.ParkingSpot;
import main.java.design.problems.parking.strategy.ParkingStrategy;

import java.util.List;

public class ParkingNearExit implements ParkingStrategy {
    @Override
    public ParkingSpot findParkingSpot(List<ParkingSpot> parkingSpots, Vehicle vehicle) {
        return parkingSpots.stream()
                .filter(spot -> spot.isEmpty() && spot.getTypeOfSpot() == vehicle.getVehicleType())
                .reduce((first,second) -> second)
                .orElseThrow(()-> new IllegalStateException("No Compatible Parking spots found for : " + vehicle.getVehicleType()));
    }
}
