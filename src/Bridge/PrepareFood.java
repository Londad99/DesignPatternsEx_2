package Bridge;

public abstract class PrepareFood {

    private IElaborate implementor;

    private String name;

    public IElaborate getImplementor() {
        return this.implementor;
    }

    public void setImplementor(IElaborate implementor) {
        this.implementor = implementor;
    }

    public abstract void obtain();
}
