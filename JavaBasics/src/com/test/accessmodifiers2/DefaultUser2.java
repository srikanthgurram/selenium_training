package com.test.accessmodifiers2;

import com.test.accessmodifiers.DefaultClass;

/**
 * Created by srikanth on 23/12/16.
 */
public class DefaultUser2 {
    public static void main(String[] args){
        /*
            Default variables or methods cannot be accessed outside of the package
         */
        DefaultClass pClass = new DefaultClass();

//        pClass.printMessage();
//        System.out.println("Default variable static_count = "+pClass.static_count);
    }
}
