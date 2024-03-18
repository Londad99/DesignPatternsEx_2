package Adapter;

public class ElectricEngineAdapter extends Engine{

    private ElectricEngine electricEngine;

    public ElectricEngineAdapter() {
        this.electricEngine = new ElectricEngine();
    }

    @Override
    public void start() {
        this.electricEngine.connect();
        this.electricEngine.activate();
    }

    @Override
    public void stop() {
        this.electricEngine.stop();
    }

    @Override
    public void accelerate() {
        this.electricEngine.accelerate();
    }
}
