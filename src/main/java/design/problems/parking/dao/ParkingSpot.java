package main.java.design.problems.parking.dao;

import main.java.design.problems.parking.enums.VehicleType;

public class ParkingSpot {
    private int spotId;
    private VehicleType typeOfSpot;
    private String vehicle;
    private boolean isEmpty = true;

    public int getSpotId() {
        return spotId;
    }

    public void setSpotId(int spotId) {
        this.spotId = spotId;
    }

    public VehicleType getTypeOfSpot() {
        return typeOfSpot;
    }

    public void setTypeOfSpot(VehicleType typeOfSpot) {
        this.typeOfSpot = typeOfSpot;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }
}
