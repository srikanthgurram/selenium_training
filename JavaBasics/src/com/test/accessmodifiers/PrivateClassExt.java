package com.test.accessmodifiers;

/**
 * Created by srikanth on 30/12/16.
 */
public class PrivateClassExt extends PrivateClass {
    public static void main(String[] args){
        /*
            Private variables or methods cannot be accessed from sub/child class
         */
        PrivateClassExt pve = new PrivateClassExt();

//        System.out.println("Car model = "+pve.carModel);
    }
}
