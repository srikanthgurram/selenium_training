package com.test.accessmodifiers;

/**
 * Created by srikanth on 30/12/16.
 */
public class StaticUser {

    public static void main(String[] args){
        System.out.println("value from another class"+ ProtectClass.static_count);

        ProtectClass.incrementCount();
    }
}
