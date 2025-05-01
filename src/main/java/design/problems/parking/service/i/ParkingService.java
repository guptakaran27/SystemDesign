package main.java.design.problems.parking.service.i;

import main.java.design.problems.parking.dao.ParkingSpot;
import main.java.design.problems.parking.dao.Ticket;
import main.java.design.problems.parking.enums.VehicleType;

/**
 * @author rohan.gupta
 */
public interface ParkingService {
    public Ticket park(String vehicleNumber, VehicleType vehicleType);
    public Ticket unpark(String vehicleNumber);
    public boolean addParkingLot(ParkingSpot parkingSpot);
}
