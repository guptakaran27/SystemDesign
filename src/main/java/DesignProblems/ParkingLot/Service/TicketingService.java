package main.java.DesignProblems.ParkingLot.Service;

import main.java.DesignProblems.ParkingLot.Pojos.ParkingSpot;
import main.java.DesignProblems.ParkingLot.Pojos.Receipt;
import main.java.DesignProblems.ParkingLot.Pojos.Ticket;
import main.java.DesignProblems.ParkingLot.Pojos.Vehicle;
import main.java.DesignProblems.ParkingLot.Strategy.PricingStrategy;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

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
