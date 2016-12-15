package com.test;

/**
 * Created by srikanth on 15/12/16.
 */
public class Car {
    //properties or Instance variables
    String model;
    String make;
    String weight;
    String color = "White";

    // methods
    void startCar(String carModel){
        System.out.println("Starting "+carModel+" car..");
    };

    void stopCar(){
        System.out.println("Stopping my car..");
    }

    void getCarDetails(){
        System.out.println("Car Model: "+model);
        System.out.println("Car Make: "+make);
        System.out.println("Car Weight: "+weight);
        System.out.println("Car Color: "+color);
    }

}
