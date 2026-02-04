package javacollectionstreams.regex.advanced.bank;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BankAccountTest {

    BankAccount account = new BankAccount();

    @Test
    void testDeposit() {
        account.deposit(100);
        assertEquals(100, account.getBalance());
    }

    @Test
    void testWithdraw() {
        account.deposit(100);
        account.withdraw(50);
        assertEquals(50, account.getBalance());
    }

    @Test
    void testInsufficientBalance() {
        assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(100);
        });
    }
}

