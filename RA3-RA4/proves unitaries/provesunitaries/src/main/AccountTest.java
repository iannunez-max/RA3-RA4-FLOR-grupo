package main;

public class AccountTest {
    public static void main(String[] args) {
        AccountTest test = new AccountTest();
        test.testDepositSuccess();
        test.testDepositNegativeAmount();
        test.testWithdrawSuccess();
        test.testWithdrawMoreThanBalance();
        test.testWithdrawNegativeAmount();
    }

    private void assertEquals(int expected, int actual, String message) {
        if (expected != actual) {
            System.out.println("FAIL: " + message + " Expected: " + expected + ", but got: " + actual);
        } else {
            System.out.println("PASS: " + message);
        }
    }

    public void testDepositSuccess() {
        Account account = new Account(100);
        account.depositAmount(50);
        assertEquals(150, account.getBalance(), "Test deposit success");
    }

    public void testDepositNegativeAmount() {
        Account account = new Account(100);
        account.depositAmount(-20);
        assertEquals(100, account.getBalance(), "Test deposit negative amount");
    }

    public void testWithdrawSuccess() {
        Account account = new Account(100);
        account.withdrawAmount(50);
        assertEquals(50, account.getBalance(), "Test withdraw success");
    }

    public void testWithdrawMoreThanBalance() {
        Account account = new Account(100);
        account.withdrawAmount(150);
        assertEquals(100, account.getBalance(), "Test withdraw more than balance");
    }

    public void testWithdrawNegativeAmount() {
        Account account = new Account(100);
        account.withdrawAmount(-30);
        assertEquals(100, account.getBalance(), "Test withdraw negative amount");
    }
}



