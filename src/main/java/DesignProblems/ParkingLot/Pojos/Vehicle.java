package main.java.DesignProblems.ParkingLot.Pojos;/*
 * @project DesignPattern
 * @author karan.k.gupta
 *
 */

import main.java.DesignProblems.ParkingLot.Enums.VehicleType;

public class Vehicle {

    private String vehicleNo;
    private VehicleType vehicleType;

    public Vehicle(String vehicleNo, VehicleType vehicleType) {
        this.vehicleNo = vehicleNo;
        this.vehicleType = vehicleType;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
