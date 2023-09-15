package org.example;

public class Card {

    public Card(int cardNumber){
        this.cardNumber = cardNumber;
    }
    public int cardNumber;

    private int pinCode;

    private int cvv;


    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }
}
