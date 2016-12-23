package com.test.accessmodifiers;

/**
 * Created by srikanth on 23/12/16.
 */
public class PublicUser {
    public static void main(String[] args){
        PublicClass puClass = new PublicClass();

        puClass.sayHello();
        System.out.println("Name = "+puClass.name);

    }
}
