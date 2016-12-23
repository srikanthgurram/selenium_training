package com.test.accessmodifiers;

/**
 * Created by srikanth on 23/12/16.
 */
public class DefaultClass {
    /*
        Default
        Public
        Private
        Protect
     */
    int count = 100;
    String message = "Hello";

    int getCount(){
        return count;
    }

    void printMessage(){
        System.out.println(message);
    }

    String getMessage(){
        return message;
    }

}
