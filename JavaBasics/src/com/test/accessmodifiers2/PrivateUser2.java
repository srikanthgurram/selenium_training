package com.test.accessmodifiers2;

import com.test.accessmodifiers.PrivateClass;

/**
 * Created by srikanth on 23/12/16.
 */
public class PrivateUser2 {
    public static void main(String[] args) {
        PrivateClass prClass2 = new PrivateClass();
        prClass2.getCarDetails();
        System.out.println("----------------------");
        prClass2.setCarDetails("SUV x300", "M&M");
        prClass2.getCarDetails();
        System.out.println("----------------------");
        prClass2.setCarDetails("Tata Nano", "Tata");
        prClass2.getCarDetails();
        System.out.println("----------------------");

    }
}