package Composite;

public class Main {
    public static void main(String[] args) {
        SimpleProduct cpuAMD = new SimpleProduct("AMD Ryzen 5 3400g", 199.99, "AMD");

        SimpleProduct ram16GB = new SimpleProduct("Corsair Vengeance LPX 16GB", 79.99, "Corsair");

        SimpleProduct hdd1TB = new SimpleProduct("Seagate Barracuda 1TB", 49.99, "Seagate");

        SimpleProduct ssd500GB = new SimpleProduct("Samsung 860 EVO 500GB", 89.99, "Samsung");

        SimpleProduct motherboard = new SimpleProduct("ASUS Prime B450M-A", 79.99, "ASUS");

        SimpleProduct powerSupply = new SimpleProduct("EVGA 600 W1", 49.99, "EVGA");

        SimpleProduct casePC = new SimpleProduct("NZXT H510", 69.99, "NZXT");

        CompositeProduct pc = new CompositeProduct("PC");
        pc.addProduct(cpuAMD);
        pc.addProduct(ram16GB);
        pc.addProduct(hdd1TB);
        pc.addProduct(ssd500GB);
        pc.addProduct(motherboard);
        pc.addProduct(powerSupply);
        pc.addProduct(casePC);
    }
}
