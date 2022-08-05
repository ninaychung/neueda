package com.citi.account;

public class Account {

    private String name;
    private double balance;
    private static double interestRate = .1;

    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;

    }

    public Account() {
        this.name = "Nina";
        this.balance = 50;
    }

    public boolean withdraw(double amount) {
        if (this.balance > amount) {
            setBalance(this.balance - amount);
            System.out.println(
                    "Successfully withdrawn $" + String.format("%.2f", amount) + ". New balance: $"
                            + String.format("%.2f", getBalance()));
            return true;
        } else {
            System.out.println("Withdraw transaction failed");
            return false;
        }
    }

    public boolean withdraw() {
        return withdraw(20);
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setBalance(double newBalance) {
        this.balance = newBalance;
    }

    public static void setInterestRate(double newInterestRate) {
        interestRate = newInterestRate;
    }

    public void addInterest() {
        this.balance *= (1 + interestRate);
    }

}
