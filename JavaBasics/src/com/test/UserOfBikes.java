package com.test;

import com.test.inheritance.multi_level.Bike;
import com.test.inheritance.multi_level.BmwBike;
import com.test.inheritance.multi_level.IndianBike;

/**
 * Created by srikanth on 21/12/16.
 */
public class UserOfBikes {

    public static void main(String[] args){

        //create instance for parent class
        Bike parent = new Bike();

        //create instance for child classes
//        BmwBike child1 = new BmwBike();
        Bike child1 = new BmwBike();

        IndianBike child2 = new IndianBike();
        
//        parent.startBike();
//        parent.stopBike();
//        parent.applyBreak();
        //  parent.getDetails();

        child1.startBike();
        child1.stopBike();
        child1.applyBreak();
//        child1.getDetails();
//
//        child2.startBike();
//        child2.stopBike();
//        child2.applyBreak();
////        child2.getDetails();

    }
}
