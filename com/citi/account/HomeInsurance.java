package com.citi.account;

public class HomeInsurance implements Detailable {
    private double premium;
    private double excess;
    private double amountInsured;

    public HomeInsurance(double premium, double excess, double amountInsured) {
        this.premium = premium;
        this.excess = excess;
        this.amountInsured = amountInsured;
    }

    public double getPremium() {
        return premium;
    }

    public void setPremium(double premium) {
        this.premium = premium;
    }

    public double getExcess() {
        return excess;
    }

    public void setExcess(double excess) {
        this.excess = excess;
    }

    public double getAmountInsured() {
        return amountInsured;
    }

    public void setAmountInsured(double amountInsured) {
        this.amountInsured = amountInsured;
    }

    @Override
    public String getDetails() {
        return "Premium: " + premium + " Excess: " + excess + " Amount Insured: " + amountInsured;

    }

}
