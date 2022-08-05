package com.citi.account;

public class CurrentAccount extends Account {
    private String name;
    private double balance;

    public CurrentAccount(String name, double balance) {
        super(name, balance);

    }

    // add interest method from the subclass CurrentAccount
    @Override
    public void addInterest() {
        setBalance(getBalance() * 1.1);
    }
}