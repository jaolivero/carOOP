package com.carObject;

import java.util.Random;

public class BankAccount {
    private String Name;
    private long acctNumber;
    private double balance;
    private DebitCard debitCard;

    public BankAccount (String Name, long acctNumber, double balance, DebitCard debitCard) {
        this.Name = Name;
        this.acctNumber = acctNumber;
        this.balance = balance;
        this.debitCard = debitCard;
    }

    public void deposit (double amount) {
        balance += amount;
    }

    public void withdraw (double amount) {
        if (amount <= balance && this.acctNumber == acctNumber) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds ");
        }
    }
    public void generateRandom(double acctNumber) {
        Random rand = new Random();
        this.acctNumber = (long)rand.nextDouble();
    }
}

class Savings extends BankAccount {
    float interest = 4/100;

    public Savings(String Name, long acctNumber, double balance) {
        super(Name, acctNumber, balance, debitCard);
    }

    public int addInterest(int balance) {
        return balance *= interest;
    }
}

class CD extends BankAccount{
    boolean Locked;
    public CD(String Name, long acctNumber, double balance) {
        super(Name, acctNumber, balance);
    }
}