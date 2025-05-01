package main.java.design.problems.parking.service;

import main.java.design.problems.parking.enums.VehicleType;
import main.java.design.problems.parking.dao.ParkingSpot;
import main.java.design.problems.parking.dao.Ticket;
import main.java.design.problems.parking.strategy.ParkingStrategy;
import main.java.design.problems.parking.strategy.PricingStrategy;

import java.util.List;

/**
 * @author Karan Gupta
 */
public class ParkingService {

    private List<ParkingSpot> parkingSpots;
    private int availableSlots;
    TicketingService ticketingService;

    public ParkingService(List<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
        this.availableSlots = parkingSpots.size();
        this.ticketingService = new TicketingService();
    }

    public int getAvailableSlots(){return this.availableSlots;}

    public ParkingSpot findParkingSpot(ParkingStrategy parkingStrategy, Vehicle vehicle){
        if(availableSlots == 0){
            System.out.println("Parking is Full");
            return null;
        }
        else {
            System.out.println("Finding Parking spots for: " + vehicle.getVehicleNo());
            return parkingStrategy.findParkingSpot(parkingSpots,vehicle);
        }
    }

    public Ticket parkVehicle(Vehicle vehicle, ParkingSpot parkingSpot, PricingStrategy pricingStrategy){
        parkingSpot.setVehicle(vehicle);
        System.out.println("Vehicle PArked: " + vehicle.getVehicleNo());
        parkingSpot.setEmpty(false);
        availableSlots--;

        System.out.println("Generating Parking Ticket");
        return ticketingService.generateTicket(vehicle, parkingSpot, pricingStrategy);
    }

    public Receipt unparkVehicle(Ticket ticket){
        System.out.println("Vehicle Unparked");
        ParkingSpot occupiedSpot = ticket.getParkingSpot();
        occupiedSpot.setEmpty(true);
        occupiedSpot.setVehicle(null);
        availableSlots++;

        System.out.println("Generating Receipt for Vehicle: " + ticket.getVehicle().getVehicleNo());
        return ticketingService.generateReceipt(ticket);
    }

    public void addParkingSpot(int spotId, VehicleType typeOfSpot){
        parkingSpots.add(new ParkingSpot(spotId, typeOfSpot));
        availableSlots++;
    }

    public void removeParkingSpot(ParkingSpot spot){
        if(!spot.isEmpty()){
            System.out.println("Spot contains a Vehicle: " + spot.getVehicle().getVehicleNo());
        }
        else {
            parkingSpots.remove(spot);
            availableSlots--;
        }
    }

}
