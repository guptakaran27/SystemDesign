package main.java.design.problems.parking.service.repo;

import main.java.design.problems.parking.dao.ParkingSpot;
import main.java.design.problems.parking.enums.VehicleType;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author rohan.gupta
 */
public class ParkingLotInmemoryRepo {

    private static final ParkingLotInmemoryRepo parkingLotInmemoryRepo = new ParkingLotInmemoryRepo();

    private ParkingLotInmemoryRepo(){}

    public static ParkingLotInmemoryRepo getInstance(){
        return parkingLotInmemoryRepo;
    }

    Map<Integer,ParkingSpot> parkingSpotMap = new ConcurrentHashMap<>();

    public ParkingSpot findFirstFreeParkingLotByVehicleType(VehicleType vehicleType){
        for (Map.Entry<Integer, ParkingSpot> integerParkingSpotEntry : parkingSpotMap.entrySet()) {
            if(integerParkingSpotEntry.getValue().getTypeOfSpot().equals(vehicleType) && integerParkingSpotEntry.getValue().isEmpty()){
                return integerParkingSpotEntry.getValue();
            }
        }
        return null;
    }
}
