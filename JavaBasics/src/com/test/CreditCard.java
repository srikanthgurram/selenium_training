package com.test;

/**
 * Created by srikanth on 15/12/16.
 */
public class CreditCard {
    //properties
    private String cardNumber = "2342-2342-2342-3243";
    String expiryDate = "02/33";

    // methods
    public String getCardNumber(){
        return cardNumber;
    }

    String getExpiryDate(){
        return expiryDate;
    }

    String getPaymentDetails(){
        return "$50";
    }

    public static void main(String[] args){
        //create object for class CreditCard
        CreditCard card = new CreditCard();

        //variable in the class
        System.out.println("Card number = "+ card.cardNumber);
        System.out.println("Expiry Date = "+ card.expiryDate);

        //methods in the class
        String cardNumber = card.getCardNumber();
        String expiryDate = card.getExpiryDate();

        System.out.println("get card number = "+ cardNumber );
        System.out.println("get expiry date = "+ card.getExpiryDate());

    }
}


