package Adapter;

public class Application {
    private void useCommonEngine() {
        Engine engine = new CommonEngine();

        engine.start();
        engine.accelerate();
        engine.stop();
    }

    private void useElectricEngine() {
        Engine engine = new ElectricEngineAdapter();

        engine.start();
        engine.accelerate();
        engine.stop();
    }

    public static void main(String[] args) {
        Application app = new Application();
        app.useCommonEngine();
        app.useElectricEngine();
    }
}
