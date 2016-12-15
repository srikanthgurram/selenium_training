package com.test;

/**
 * Created by srikanth on 2/12/16.
 */
public class Methods {
    public static void main(String[] args){
        String userName = "Srikanth";
        mesage(userName);

        System.out.println("result = "+addition(50,20));
    }

    public static void mesage(String name){
        System.out.println("Hello "+name);
    }

    public static int addition(int a, int b){
        return a + b;
    }

}
