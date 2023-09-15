package org.example;

import java.util.ArrayList;

public class Bank {


    private ArrayList<Card> cards = new ArrayList<>();

    public ArrayList<Card> getCards() {
        createCards();
        addPinCode();

        return cards;
    }

    private void createCards(){
        Card card = new Card(111111111);
        Card cardFirst = new Card(222222222);
        Card cardSecond = new Card(333333333);
        Card cardThird = new Card(444444444);
        Card cardFourth = new Card(555555555);
        cards.add(card);
        cards.add(cardFirst);
        cards.add(cardSecond);
        cards.add(cardThird);
        cards.add(cardFourth);
    }

    private void addPinCode(){
        cards.get(0).setPinCode(1111);
        cards.get(1).setPinCode(2222);
        cards.get(2).setPinCode(3333);
        cards.get(3).setPinCode(4444);
        cards.get(4).setPinCode(5555);
    }

    private void addCvv(){
        cards.get(0).setCvv(111);
        cards.get(0).setCvv(222);
        cards.get(0).setCvv(333);
        cards.get(0).setCvv(444);
        cards.get(0).setCvv(555);
        System.out.println(cards.get(0).getPinCode());
        System.out.println(cards.get(0).getCvv());
    }
}
