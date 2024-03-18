package Bridge;

public class PreparePizza extends PrepareFood{

    public PreparePizza(IElaborate implementor) {
        super.setImplementor(implementor);
    }

    @Override
    public void obtain() {
        System.out.println("Preparing pizza...");
        this.getImplementor().process();
    }
}
