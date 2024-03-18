package Bridge;

public class Pepperoni implements IElaborate{
    public Pepperoni() {
    }

    @Override
    public void process() {
        System.out.println("Pepperoni pizza elaborated.");
    }
}
