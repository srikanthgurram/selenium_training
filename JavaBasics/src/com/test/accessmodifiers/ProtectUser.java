package com.test.accessmodifiers;

/**
 * Created by srikanth on 23/12/16.
 */
public class ProtectUser {
    public static void main(String[] args){
        /*
            You cannot access protect variables or methods with in the same package
         */
        ProtectUser pt = new ProtectUser();
//        System.out.println("Counter value = "+pt.static_count);

//        pt.incrementCount();
    }

}
