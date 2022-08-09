package com.citi.account;

public class TestLambdas {
    public static void main(String[] args) {
        Detailable det = () -> {
            return "hello world";
        };
        System.out.println(det.getDetails());
    }
}
