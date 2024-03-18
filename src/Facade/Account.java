package Facade;

public class Account {
    private double balance;
    private boolean accountStatus;

    public Account() {
        this.balance = 0;
        this.accountStatus = false;
    }
    public Account(double balance, boolean accountStatus) {
        this.balance = balance;
        this.accountStatus = accountStatus;
    }

    public void checkBalance() {
        System.out.println("Your balance is: " + balance);
    }

    public void blockAccount() {
        accountStatus = false;
        System.out.println("Your account has been blocked");
    }

    public void unblockAccount() {
        accountStatus = true;
        System.out.println("Your account has been unblocked");
    }

    public void withdraw(double amount) {
        if (accountStatus) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("You have withdrawn: " + amount);
            } else {
                System.out.println("Insufficient funds");
            }
        } else {
            System.out.println("Your account is blocked");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(boolean accountStatus) {
        this.accountStatus = accountStatus;
    }
}
