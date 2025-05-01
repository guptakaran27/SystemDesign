package main.java.design.problems.parking.dao;

import main.java.design.problems.parking.enums.VehicleType;

import java.time.LocalDateTime;

public class Ticket {
    private int ticketId;
    private String vehicleNumber;
    private VehicleType vehicleType;
    private String parkingId;
    private LocalDateTime entryTime;
    private LocalDateTime exitTime;
    private boolean status;
}
