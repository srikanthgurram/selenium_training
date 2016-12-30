package com.test.accessmodifiers2;

/**
 * Created by srikanth on 23/12/16.
 */
public class ProtectUser2 {
    public static void main(String[] args){
        /*
            Protect variables or methods cannot be accessed outside of the package
         */

        ProtectUser2 pt = new ProtectUser2();
//        System.out.println("Counter value = "+pt.static_count);

//        pt.incrementCount();
    }

}
