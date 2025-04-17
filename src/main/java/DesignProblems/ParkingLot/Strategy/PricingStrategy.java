package main.java.DesignProblems.ParkingLot.Strategy;/*
 * @project DesignPattern
 * @author karan.k.gupta
 *
 */

import main.java.DesignProblems.ParkingLot.Pojos.Ticket;

public interface PricingStrategy {

    public int calculatePrice(Ticket ticket);
    public String getTypeofStrategy();

}
