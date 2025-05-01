package main.java.design.problems.parking.service.i;

import main.java.design.problems.parking.dao.ParkingSpot;
import main.java.design.problems.parking.enums.VehicleType;

/**
 * @author rohan.gupta
 */
public interface ParkingLotDal {
    ParkingSpot getAvailableParkingSpot(VehicleType vehicleType);
    boolean updateParkingSpot(ParkingSpot parkingSpot);
    boolean addParkingSpot(ParkingSpot parkingSpot);
}
