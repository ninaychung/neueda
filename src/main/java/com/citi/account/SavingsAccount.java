package com.citi.account;

public class SavingsAccount extends Account {
    private String name;
    private double balance;

    public SavingsAccount(String name, double balance) {
        super(name, balance);

    }

    // add interest method from the subclass SavingsAccount
    @Override
    public void addInterest() {
        setBalance(getBalance() * 1.4);
    }

}
