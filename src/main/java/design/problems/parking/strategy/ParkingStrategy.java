package main.java.design.problems.parking.strategy;/*
 * @project DesignPattern
 * @author karan.k.gupta
 *
 */

import main.java.design.problems.parking.dao.ParkingSpot;

import java.util.List;

public interface ParkingStrategy {

    public ParkingSpot findParkingSpot(List<ParkingSpot> parkingSpots, Vehicle vehicle);
}
