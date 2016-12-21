package com.test.inheritance.multi_level;

/**
 * Created by srikanth on 21/12/16.
 */
public class BmwBike extends Bike{

    public void getDetails(){
        System.out.println(color);
        System.out.println(engineCC);
        System.out.println(weight);
        System.out.println(make);
        System.out.println(model);
    }

    //apply Breaks
    @Override
    public void applyBreak(){
        System.out.println("Bmw patented DISC breaks applied");
    }

}
