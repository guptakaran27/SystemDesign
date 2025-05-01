package main.java.design.problems.parking.strategy;/*
 * @project DesignPattern
 * @author karan.k.gupta
 *
 */

import main.java.design.problems.parking.dao.Ticket;

public interface PricingStrategy {

    public int calculatePrice(Ticket ticket);
    public String getTypeofStrategy();

}
