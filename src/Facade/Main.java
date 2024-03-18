package Facade;

public class Main {

    public static void main(String[] args) {
        CashierFacade cashierFacade = new CashierFacade();
        cashierFacade.introduceCredentials("1234", "1234");
        cashierFacade.withdrawFromCard("1234", 100);
    }
}
