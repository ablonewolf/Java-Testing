package com.arka99.bankaccount;

public class Account {
    private String name;
    private double balance;

    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }
// The branch variable is true if the customer is depositing the money in a bank branch,
//    it is false if the customer is using atm
    public double deposit(double amount, boolean branch) {
        this.balance += amount;
        return this.balance;
    }

    public double withdraw(double amount, boolean branch) {
        this.balance -= amount;
        return this.balance;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }
}
