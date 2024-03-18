package Decorator;

public class Main {
    public static void main(String[] args) {

       Rentable hotelCucuta = new Hotel("Hotel Cucuta");

       hotelCucuta = new Beachfront(hotelCucuta);

       System.out.println(hotelCucuta.getDetails());

       System.out.println(hotelCucuta.obtainBudget());

    }
}
