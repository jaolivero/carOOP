package com.carObject;

public class CarLoan {
    private float remainingBalance;
    private float payment;


    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }

    private float interestRate;
    private byte years;

    public CarLoan(float remainingBalance, float payment, float interestRate, byte years) {
        this.remainingBalance = remainingBalance;
        this.payment = payment;
        this.interestRate = interestRate;
        this.years = years;
    }

    public double calculateBalance() {
        return remainingBalance - payment;
    }

    public byte getYears() {
        return years;
    }

    public void setYears(byte years) {
        this.years = years;
    }

    public float getInterestRate() {
        return interestRate;
    }
    public float getRemainingBalance() {
        return remainingBalance;
    }

    public void setRemainingBalance(float remainingBalance) {
        this.remainingBalance = remainingBalance;
    }



}
