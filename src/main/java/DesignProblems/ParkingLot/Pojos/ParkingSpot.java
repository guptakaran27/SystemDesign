package main.java.DesignProblems.ParkingLot.Pojos;/*
 * @project DesignPattern
 * @author karan.k.gupta
 *
 */

import main.java.DesignProblems.ParkingLot.Enums.VehicleType;

public class ParkingSpot {
    private int spotId;
    private boolean isEmpty;
    private Vehicle vehicle;
    private VehicleType typeOfSpot;


    public ParkingSpot(int spotId, VehicleType typeOfSpot) {
        this.spotId = spotId;
        this.typeOfSpot = typeOfSpot;
        this.isEmpty = true;
    }

    public int getSpotId() {
        return spotId;
    }

    public void setSpotId(int spotId) {
        this.spotId = spotId;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public VehicleType getTypeOfSpot() {
        return typeOfSpot;
    }

    public void setTypeOfSpot(VehicleType typeOfSpot) {
        this.typeOfSpot = typeOfSpot;
    }
}
