package Facade;

public class Cashier {

    public void addBalanceToCard(String cardNumber, double amount) {
        System.out.println("Balance added to card " + cardNumber + " successfully");
    }

    public boolean hasEnoughBalance(String cardNumber, double amount) {
        if (amount <= 1000) {
            System.out.println("Card " + cardNumber + " has enough balance");
            return true;
        } else {
            System.out.println("Card " + cardNumber + " does  not have enough balance");
            return false;
        }
    }

    public String ticketInformation(String cardNumber) {
        return "Ticket information for card " + cardNumber;
    }
}
