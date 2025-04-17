package main.java.DesignProblems.ParkingLot.Enums;/*
 * @project DesignPattern
 * @author karan.k.gupta
 *
 */

public enum VehicleType {
    TWO_WHEELER(100,30),
    FOUR_WHEELER(150,50);

    int basePrice;
    int hourlyPrice;

    VehicleType(int basePrice, int hourlyPrice ){
        this.basePrice = basePrice;
        this.hourlyPrice = hourlyPrice;
    }


    public int getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(int basePrice) {
        this.basePrice = basePrice;
    }

    public int getHourlyPrice() {
        return hourlyPrice;
    }

    public void setHourlyPrice(int hourlyPrice) {
        this.hourlyPrice = hourlyPrice;
    }
}
