package Facade;

public class CashierFacade {
    private Authenticate authenticate = new Authenticate();
    private Account account = null;
    private Cashier cashier = new Cashier();

    public void introduceCredentials(String cardNumber, String pin) {
        if (authenticate.readCard(cardNumber)) {
            authenticate.introducePin(pin);
            account = new Account(1000, true);
        }
    }

    public void withdrawFromCard(String cardNumber, double amount) {
        if (cashier.hasEnoughBalance(cardNumber, amount)) {
            account.withdraw(amount);
        }
    }

}
