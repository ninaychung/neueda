package com.citi.account;

public class TestInheritance {

    public static void main(String[] args) {
        Account[] accounts = new Account[3];
        accounts[0] = new SavingsAccount("Nina", 2);
        accounts[1] = new CurrentAccount("Nina", 4);
        accounts[2] = new CurrentAccount("Nina", 6);
        for (Account a : accounts) {
            a.addInterest();
            System.out.println(a.getName() + " " + a.getBalance());
        }

    }

}
