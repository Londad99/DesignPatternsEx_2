package Adapter;

public class CommonEngine extends Engine{

    public CommonEngine() {
        super();
    }

    @Override
    public void start() {
        System.out.println("Common engine started");
    }

    @Override
    public void stop() {
        System.out.println("Common engine stopped");
    }

    @Override
    public void accelerate() {
        System.out.println("Common engine accelerated");
    }
}
