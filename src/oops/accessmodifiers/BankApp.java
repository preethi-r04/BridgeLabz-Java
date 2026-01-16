package CoreProgramming.AccessModifiers;

class BankAccount {
    public int accountNumber;
    protected String accountHolder;
    private double balance;

    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(int accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    public void display() {
        System.out.println(accountNumber);
        System.out.println(accountHolder);
        System.out.println(getBalance());
    }
}

public class BankApp {
    public static void main(String[] args) {
        SavingsAccount a1 = new SavingsAccount(12345, "Abi", 20000);
        a1.display();
    }
}
