package Decorator;

public class Hotel implements Rentable{

    private double basePrice = 150000;
    private String type;
    private String details;

    public Hotel(String details){
        this.details = details;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public double obtainBudget() {
        return this.basePrice*1.7;
    }
}
