package com.test.accessmodifiers2;

import com.test.accessmodifiers.PublicClass;

/**
 * Created by srikanth on 23/12/16.
 */
public class PublicUser2 {
    public static void main(String[] args){
        PublicClass puClass = new PublicClass();

        puClass.sayHello();
        System.out.println("with in another package, Name "+puClass.name);
    }
}
