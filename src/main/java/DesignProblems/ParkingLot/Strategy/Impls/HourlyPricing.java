package main.java.DesignProblems.ParkingLot.Strategy.Impls;/*
 * @project DesignPattern
 * @author karan.k.gupta
 *
 */

import main.java.DesignProblems.ParkingLot.Pojos.ParkingSpot;
import main.java.DesignProblems.ParkingLot.Pojos.Ticket;
import main.java.DesignProblems.ParkingLot.Strategy.ParkingStrategy;
import main.java.DesignProblems.ParkingLot.Strategy.PricingStrategy;

import java.time.LocalDateTime;

public class HourlyPricing implements PricingStrategy {
    private static final String type = "Hourly Strategy";

    @Override
    public int calculatePrice(Ticket ticket) {
        System.out.println("\nGenerating Price as per Hourly Strategy");

        int hourlyPrice = ticket.getVehicle().getVehicleType().getHourlyPrice();
        int hoursParked = (LocalDateTime.now().getHour() - ticket.getEntryTime().getHour());
        if(hoursParked == 0) return hourlyPrice;
        else return hourlyPrice * hoursParked;
    }

    @Override
    public String getTypeofStrategy() {
        return type;
    }
}
