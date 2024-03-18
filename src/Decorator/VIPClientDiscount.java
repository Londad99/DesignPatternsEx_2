package Decorator;

public class VIPClientDiscount extends RentableDecorator{

    public VIPClientDiscount(Rentable rentable) {
        super(rentable);
    }

    @Override
    public String getDetails() {
        return super.getRentable().getDetails() + " with VIP discount";
    }

    @Override
    public String getType() {
        return super.getRentable().getType();
    }

    @Override
    public double obtainBudget() {
        return super.getRentable().obtainBudget()*0.9;
    }
}
