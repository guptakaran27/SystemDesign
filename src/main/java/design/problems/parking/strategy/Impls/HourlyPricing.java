package main.java.design.problems.parking.strategy.Impls;/*
 * @project DesignPattern
 * @author karan.k.gupta
 *
 */

import main.java.design.problems.parking.dao.Ticket;
import main.java.design.problems.parking.strategy.PricingStrategy;

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
