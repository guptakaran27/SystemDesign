package main.java.design.problems.parking.service.impl;

import main.java.design.problems.parking.dao.ParkingSpot;
import main.java.design.problems.parking.enums.VehicleType;
import main.java.design.problems.parking.service.i.ParkingLotDal;
import main.java.design.problems.parking.service.repo.ParkingLotInmemoryRepo;

/**
 * @author rohan.gupta
 */
public class ParkingLotInmemoryDal implements ParkingLotDal {

    ParkingLotInmemoryRepo parkingLotInmemoryRepo = ParkingLotInmemoryRepo.getInstance();

    @Override
    public ParkingSpot getAvailableParkingSpot(VehicleType vehicleType) {
        return null;
    }

    @Override
    public boolean updateParkingSpot(ParkingSpot parkingSpot) {
        return false;
    }

    @Override
    public boolean addParkingSpot(ParkingSpot parkingSpot) {
        return false;
    }
}
