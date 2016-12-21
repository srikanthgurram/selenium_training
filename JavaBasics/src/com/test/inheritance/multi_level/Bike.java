package com.test.inheritance.multi_level;

/**
 * Created by srikanth on 21/12/16.
 */
public class Bike {
//    Class variables or properties
    String color;
    String engineCC;
    String weight;
    String make;
    String model;

    // Methods
    public void startBike(){
        System.out.println("Bike has started...");
    };

    //
    public void stopBike(){
        System.out.println("Bike has stopped ...");
    }

    //apply Breaks
    public void applyBreak(){
        System.out.println("Drum breaks applied successfully..");
    }


}
