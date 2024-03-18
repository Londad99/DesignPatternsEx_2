package Decorator;

public class Beachfront extends RentableDecorator{

    public Beachfront(Rentable rentable) {
        super(rentable);
    }

    @Override
    public String getDetails() {
        return super.getRentable().getDetails() + " with beachfront view";
    }

    @Override
    public String getType() {
        return super.getRentable().getType();
    }

    @Override
    public double obtainBudget() {
        return super.getRentable().obtainBudget();
    }
}
