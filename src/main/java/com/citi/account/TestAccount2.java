package com.citi.account;

public class TestAccount2 {
    public static void main(String[] args) {
        String name = "Nick";
        String name2 = "Nick";
        if (name == name2) {
            // actually does work here, but may not always work, so
            // not good practice
            // there's a stringPool JVM that will point these two to the same object
            // if they're equal
            // .equals() is good practice
            // except when it's null you'll get a null pointer exception
            System.out.println("the same");
        }
        Account[] arrayOfAccounts = new Account[5];
        double[] amounts = { 23, 5444, 2, 345, 34 };
        String[] names = { "Picard", "Ryker", "Worf", "Troy", "Data" };

        for (int i = 0; i < arrayOfAccounts.length; i++) {
            arrayOfAccounts[i] = new SavingsAccount(names[i], amounts[i]);
            System.out
                    .println("New Account added. Name: " + names[i] + " Amount: $" + String.format("%.2f", amounts[i]));
            arrayOfAccounts[i].addInterest();
            System.out
                    .println(
                            "Amount after adding interest: $" + String.format("%.2f", arrayOfAccounts[i].getBalance()));

        }

        arrayOfAccounts[0].withdraw(10);
        arrayOfAccounts[0].withdraw(100);
        arrayOfAccounts[1].withdraw();

    }
}
