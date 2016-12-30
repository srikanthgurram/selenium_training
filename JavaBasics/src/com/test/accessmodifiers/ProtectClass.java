package com.test.accessmodifiers;

/**
 * Created by srikanth on 23/12/16.
 */
public class ProtectClass {
    //instance variable
    protected int count = 0;

    //class variable
    protected static int static_count = 0;

    public static void incrementCount(){
        static_count += 1; //static_count = static_count + 1
//        count += 1;
        System.out.println("static_counter stopped at "+static_count);
//        System.out.println("counter stopped at "+this.count);
    }
}
