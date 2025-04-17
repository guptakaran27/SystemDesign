package main.java.DesignProblems.ParkingLot.Pojos;/*
 * @project DesignPattern
 * @author karan.k.gupta
 *
 */

import main.java.DesignProblems.ParkingLot.Strategy.PricingStrategy;

import java.time.LocalDateTime;

public class Ticket {

    private LocalDateTime entryTime;
    private LocalDateTime exitTime;
    private Vehicle vehicle;
    private ParkingSpot parkingSpot;
    private PricingStrategy pricingStrategy;

    public Ticket(LocalDateTime entryTime, Vehicle vehicle, ParkingSpot parkingSpot, PricingStrategy pricingStrategy) {
        this.entryTime = entryTime;
        this.vehicle = vehicle;
        this.parkingSpot = parkingSpot;
        this.pricingStrategy = pricingStrategy;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(LocalDateTime entryTime) {
        this.entryTime = entryTime;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    public PricingStrategy getPricingStrategy(){
        return this.pricingStrategy;
    }
}
