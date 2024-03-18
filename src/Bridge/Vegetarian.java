package Bridge;

public class Vegetarian implements IElaborate{

    public Vegetarian() {
    }

    @Override
    public void process() {
        System.out.println("Vegetarian pizza elaborated.");
    }
}
