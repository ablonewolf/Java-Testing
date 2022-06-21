package com.arka99.bankaccount;

public class Account {
    private String name;
    private double balance;

    public static final int CHECKING = 1;
    public static final int SAVINGS = 2;

    private int accountType;

    public Account(String name, double balance, int accountType) {
        this.name = name;
        this.balance = balance;
        this.accountType = accountType;
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

    public boolean isChecking() {
        return this.accountType == CHECKING;
    }
}
