package com.citi.account;

public class TestInterfaces {
    public static void main(String[] args) {
        Detailable[] detailables = new Detailable[3];
        detailables[0] = new CurrentAccount("Nina", 2);
        detailables[1] = new SavingsAccount("Nina", 4);
        detailables[2] = new HomeInsurance(100, 10, 1000);
        for (Detailable d : detailables) {
            System.out.println(d.getDetails());

        }
    }
}
