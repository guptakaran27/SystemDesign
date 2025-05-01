package main.java.design.problems.parking.service.impl;

import main.java.design.problems.parking.dao.ParkingSpot;
import main.java.design.problems.parking.dao.Ticket;
import main.java.design.problems.parking.enums.VehicleType;
import main.java.design.problems.parking.service.i.ParkingLotDal;
import main.java.design.problems.parking.service.i.ParkingService;
import main.java.design.problems.parking.service.i.ParkingTicketDal;

/**
 * @author rohan.gupta
 */
public class ParkingServiceImpl implements ParkingService {

    private ParkingLotDal parkingLotDal = new ParkingLotInmemoryDal();
    private ParkingTicketDal parkingTicketDal;

    @Override
    public Ticket park(String vehicleNumber, VehicleType vehicleType) {
        ParkingSpot availableParkingSpot = parkingLotDal.getAvailableParkingSpot(vehicleType);
        Ticket ticket = new Ticket();
        //update parking lot
        //save ticket
        return ticket;
    }

    @Override
    public Ticket unpark(String vehicleNumber) {
        Ticket byVehicleNumber = parkingTicketDal.findByVehicleNumber(vehicleNumber);
        //do updates
        parkingTicketDal.save(byVehicleNumber);
        return byVehicleNumber;
    }

    @Override
    public boolean addParkingLot(ParkingSpot parkingSpot) {
        parkingLotDal.addParkingSpot(null);
        return false;
    }
}
