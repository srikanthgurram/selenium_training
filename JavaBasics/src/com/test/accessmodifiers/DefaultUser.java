package com.test.accessmodifiers;

/**
 * Created by srikanth on 23/12/16.
 */
public class DefaultUser {

    public static void main(String[] args){
        DefaultClass dClass = new DefaultClass();

        dClass.printMessage();
        System.out.println("Default variable static_count = "+dClass.count);
    }
}
