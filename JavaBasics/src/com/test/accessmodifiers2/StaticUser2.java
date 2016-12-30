package com.test.accessmodifiers2;

import com.test.accessmodifiers.ProtectClass;

/**
 * Created by srikanth on 30/12/16.
 */
public class StaticUser2 {

    public static void main(String[] args){
//        System.out.println("value from another class"+ProtectClass.static_count);
        for(int i=0;i<2;i++){
            ProtectClass.incrementCount();
        }
    }
}
