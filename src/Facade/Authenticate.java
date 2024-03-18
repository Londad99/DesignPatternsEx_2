package Facade;

public class Authenticate {

    public boolean readCard(String cardNumber) {
        if (cardNumber.equals("1234")) {
            System.out.println("Card read successfully");
            return true;
        } else {
            System.out.println("Card read failed");
            return false;
        }
    }

    private boolean verifyPin(String pin) {
        if (pin.equals("1234")) {
            return true;
        } else {
            return false;
        }
    }

    public void introducePin(String pin) {
        System.out.println("Pin introduced successfully");
        verifyPin(pin);
        if (verifyPin(pin)) {
            System.out.println("Pin verified successfully");
        } else {
            System.out.println("Pin verified failed");
        }
    }



}
