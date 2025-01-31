package main;

class Account {
    private int balance;

    public Account(int initialBalance) {
        if (initialBalance < 0) {
            this.balance = 0;
        } else {
            this.balance = initialBalance;
        }
    }

    public void depositAmount(int amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdrawAmount(int amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    public int getBalance() {
        return balance;
    }
}