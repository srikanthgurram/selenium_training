package com.test;

/**
 * Created by srikanth on 2/12/16.
 */
public class Basics {

    // main
    public static void main(String[] args){
        String message = "hello";
        int ch = 'a';
        System.out.println("Value of ch = "+ch);
        System.out.println(message+" "+"How are you?");
        System.out.println(ch == 97);

        if(ch != 97){
            System.out.println("Both are equal");
        }else if(ch == 97){
            System.out.println("They matched");
        }else{
            System.out.println("They mismatched");
        }

        for(int i=10; i>=0; i--){
//            if(i==5) break;
            if(i==5) continue;
            System.out.println("i = "+i);
        }

    }


}

