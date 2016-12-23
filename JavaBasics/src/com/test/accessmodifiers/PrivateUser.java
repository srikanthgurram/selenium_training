package com.test.accessmodifiers;

/**
 * Created by srikanth on 23/12/16.
 */
public class PrivateUser {

    public static void main(String[] args){
        PrivateClass prUser = new PrivateClass();

        prUser.getCarDetails();
        System.out.println("--------------------------");
//        prUser.setCarModel("XUV 500");
        prUser.getCarDetails();

//        --------------------------------------
//        System.out.println("Car make = "+prUser.carMake);
    }
}
