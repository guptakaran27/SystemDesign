package main.java.DesignProblems.ParkingLot.Pojos;

/**
 * @author Karan Gupta <karan.k.gupta@oracle.com>
 */
public class Receipt {

    private int spotId;
    private int price;

    private String pricingStrategy;

    public Receipt(int spotId, int price, String pricingStrategy) {
        this.price = price;
        this.spotId = spotId;
        this.pricingStrategy = pricingStrategy;
    }

    @Override
    public String toString() {
        return "Receipt{" +
                "spotId=" + spotId +
                ", price=" + price +
                ", pricingStrategy='" + pricingStrategy + '\'' +
                '}';
    }
}
