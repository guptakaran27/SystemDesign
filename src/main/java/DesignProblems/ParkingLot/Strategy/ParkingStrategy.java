package main.java.DesignProblems.ParkingLot.Strategy;/*
 * @project DesignPattern
 * @author karan.k.gupta
 *
 */

import main.java.DesignProblems.ParkingLot.Pojos.ParkingSpot;
import main.java.DesignProblems.ParkingLot.Pojos.Vehicle;

import java.util.List;

public interface ParkingStrategy {

    public ParkingSpot findParkingSpot(List<ParkingSpot> parkingSpots, Vehicle vehicle);
}
