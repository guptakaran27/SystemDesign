package main.java.design.problems.parking.strategy.Impls;/*
 * @project DesignPattern
 * @author karan.k.gupta
 *
 */

import main.java.design.problems.parking.dao.Ticket;
import main.java.design.problems.parking.strategy.PricingStrategy;

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
