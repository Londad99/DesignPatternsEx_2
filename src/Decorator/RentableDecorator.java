package Decorator;

public abstract class RentableDecorator implements Rentable {

    private Rentable rentable;

    public RentableDecorator(Rentable rentable) {
        this.rentable = rentable;
    }

    public Rentable getRentable() {
        return rentable;
    }

    public void setRentable(Rentable rentable) {
        this.rentable = rentable;
    }

    public String getDetails() {
        rentable.getDetails();
        return null;
    }

    public String getType() {
        rentable.getType();
        return null;
    }

    public double obtainBudget() {
        return rentable.obtainBudget();
    }
}
