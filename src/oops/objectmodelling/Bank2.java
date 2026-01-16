package Oops.ObjectModelling;

class Bank {
    String bankName;

    Bank(String bankName) {
        this.bankName = bankName;
    }

    void openAccount(Customer customer) {
        System.out.println(customer.name + " opened an account in " + bankName);
    }
}

class Customer {
    String name;
    double balance;

    Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    void viewBalance() {
        System.out.println("Balance: " + balance);
    }
}

public class Bank2 {
    public static void main(String[] args) {
        Bank bank = new Bank("ABC Bank");
        Customer cust = new Customer("Alice", 5000);

        bank.openAccount(cust);
        cust.viewBalance();
    }
}
