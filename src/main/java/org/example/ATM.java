package org.example;

import java.util.Scanner;

public class ATM {
    int tries = 3;

    Bank bank = new Bank();
    Scanner sc = new Scanner(System.in);

    public void start() {
        System.out.println("Введите номер карты: ");

        checkCardNumber();
    }

    private void checkCardNumber() {


        int cardNumber = sc.nextInt();

        for (int i = 0; i < bank.getCards().size(); i++) {
            if (cardNumber == bank.getCards().get(i).cardNumber) {
                System.out.println("Вы молодец!");

                checkPinCode();
                break;
            }
            System.out.println("Неверный номер карты.");
            start();
            break;
        }

    }

    private void checkPinCode() {
        System.out.println("Введите пин-код:");

        if (tries != 0) {
            int pinCode = sc.nextInt();

            for (int i = 0; i < bank.getCards().size(); i++) {
                if (pinCode == bank.getCards().get(i).getPinCode()) {
                    System.out.println("Верный пин-код!");

                    break;
                }
                tries--;
                System.out.println("Неверный пин-код!.\n" + tries + " попыток осталось");
                checkPinCode();
                break;
            }
        }
        else{
                System.out.println("все друг");
            }


}
    private void checkCvv(){
        System.out.println("Введите cvv: ");
        int cvv = sc.nextInt();

        for (int i = 0; i >= bank.getCards().size(); i++){
            if (cvv == bank.getCards().get(i).getPinCode()){
                System.out.println("Верный пин-код");

                break;
            }
        }
    }
}
