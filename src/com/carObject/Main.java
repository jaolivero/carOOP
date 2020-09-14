package com.carObject;

public class Main {

    public static void main(String[] args) {
        DebitCard checkingCard = new DebitCard(5510, 441000000);
        BankAccount bankAccount = new BankAccount("Joel Olivero", 5001, 10000, checkingCard);
        bankAccount.withdraw(500);
        bankAccount.withdraw(300);
        System.out.println(bankAccount.getBalance());
    }
}
