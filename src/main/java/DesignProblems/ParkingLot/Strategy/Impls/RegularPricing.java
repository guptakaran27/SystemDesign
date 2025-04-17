package main.java.DesignProblems.ParkingLot.Strategy.Impls;/*
 * @project DesignPattern
 * @author karan.k.gupta
 *
 */

import main.java.DesignProblems.ParkingLot.Pojos.Ticket;
import main.java.DesignProblems.ParkingLot.Strategy.PricingStrategy;

public class RegularPricing implements PricingStrategy {

    private static final String type = "Regular Strategy";
    @Override
    public int calculatePrice(Ticket ticket) {
        return ticket.getVehicle().getVehicleType().getBasePrice();
    }

    @Override
    public String getTypeofStrategy() {
        return type;
    }
}
