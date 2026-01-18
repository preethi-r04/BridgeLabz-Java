package oops.encapsulation;

interface Loanable {
    void applyForLoan();
}

abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    protected double balance;

    BankAccount(String acc, String name, double bal) {
        accountNumber = acc;
        holderName = name;
        balance = bal;
    }

    void deposit(double amount) {
        balance += amount;
    }

    abstract double calculateInterest();
}

class SavingsAccount extends BankAccount {
    SavingsAccount(String acc, String name, double bal) {
        super(acc, name, bal);
    }

    double calculateInterest() {
        return balance * 0.04;
    }
}
