package com.carObject;


public class DebitCard {
    private int pin;
    private int cardNumber;

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public DebitCard(int pin, int cardNumber) {
        this.pin = pin;
        this.cardNumber = cardNumber;
    }

    public void transaction(int keycode) {
        if(keycode == pin) {
            System.out.println("Access Granted");
        } else {
            System.out.println("Access Denied");
        }
    }


}
