package main.java.design.problems.parking.service;

import main.java.design.problems.parking.dao.ParkingSpot;
import main.java.design.problems.parking.dao.Ticket;
import main.java.design.problems.parking.strategy.PricingStrategy;

import java.time.LocalDateTime;

/**
 * @author Karan Gupta
 */
public class TicketingService {

    public Ticket generateTicket(Vehicle vehicle, ParkingSpot spot, PricingStrategy pricingStrategy){
        return new Ticket(LocalDateTime.now(), vehicle, spot, pricingStrategy);
    }

    public Receipt generateReceipt(Ticket ticket){
        int finalPrice = ticket.getPricingStrategy().calculatePrice(ticket);
        return new Receipt(ticket.getParkingSpot().getSpotId(), finalPrice, ticket.getPricingStrategy().getTypeofStrategy());
    }
}
