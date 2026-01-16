package CoreProgramming.ClassObject.Level2;

class BankAccount {

    private String accHolder;
    private int accNum;
    private double balance;

    public BankAccount(String accHolder, int accNum, double balance) {
        this.accHolder = accHolder;
        this.accNum = accNum;
        this.balance = balance;
    }

    public void deposit(double amt) {
        balance = balance + amt;
        System.out.println("Deposited: " + amt);
    }

    public void withdraw(double amt) {
        if (balance >= amt) {
            balance = balance - amt;
            System.out.println("Withdrawn: " + amt);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public void displayDetails() {
        System.out.println("Account Holder: " + accHolder);
        System.out.println("Account Number: " + accNum);
        System.out.println("Balance: " + balance);
    }
}

public class ATM {
    public static void main(String[] args) {

        BankAccount b1 = new BankAccount("Abi", 123456, 20000);

        b1.displayDetails();
        b1.deposit(5000);
        b1.withdraw(3000);
        b1.displayDetails();
    }
}
