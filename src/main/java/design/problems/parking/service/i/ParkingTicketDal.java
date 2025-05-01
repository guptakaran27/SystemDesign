package main.java.design.problems.parking.service.i;

import main.java.design.problems.parking.dao.Ticket;

/**
 * @author rohan.gupta
 */
public interface ParkingTicketDal {
    boolean save(Ticket ticket);
    Ticket findById(String id);
    Ticket findByVehicleNumber(String number);
}
