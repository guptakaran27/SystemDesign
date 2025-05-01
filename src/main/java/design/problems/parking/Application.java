package main.java.design.problems.parking;

import main.java.design.problems.parking.dao.Ticket;
import main.java.design.problems.parking.enums.VehicleType;
import main.java.design.problems.parking.service.i.ParkingService;
import main.java.design.problems.parking.service.impl.ParkingServiceImpl;

/**
 * @author rohan.gupta
 */
public class Application {
    public static void main(String[] args) {
        ParkingService parkingService = new ParkingServiceImpl();
        //1. Create parking slots for 2 wheeler
        for(int i = 0;i<100;i++){
            parkingService.addParkingLot(null);
        }
        //2. Create parking slots for 4 wheeler
        for(int i = 100;i<200;i++){
            parkingService.addParkingLot(null);
        }
        //3. Park a vehicle
        Ticket ticket = parkingService.park("UP21CZ5696", VehicleType.FOUR_WHEELER);
        Ticket ticket1 = parkingService.park("UP21CZ5697", VehicleType.FOUR_WHEELER);
        Ticket ticket2 = parkingService.park("UP21CZ5698", VehicleType.TWO_WHEELER);
        Ticket ticket3 = parkingService.park("UP21CZ5699", VehicleType.TWO_WHEELER);
        Ticket ticke4 = parkingService.park("UP21CZ5690", VehicleType.FOUR_WHEELER);
        //4. Unpark
    }
}
