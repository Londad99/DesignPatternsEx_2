package Adapter;

public class ElectricEngine {

    private boolean connected = false;

    public ElectricEngine() {
        System.out.println("Electric engine created");
        this.connected = false;
    }

    public void connect() {
        System.out.println("Electric engine connected");
        this.connected = true;
    }

    public void activate() {
        if (this.connected) {
            System.out.println("Electric engine activated");
        } else {
            System.out.println("Electric engine not connected");
        }
    }

    public void accelerate() {
        if (this.connected) {
            System.out.println("Electric engine accelerated");
        } else {
            System.out.println("Electric engine not connected");
        }
    }

    public void stop() {
        if (this.connected) {
            System.out.println("Electric engine stopped");
        } else {
            System.out.println("Electric engine not connected");
        }
    }
}
