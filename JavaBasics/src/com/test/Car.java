package com.test;

/**
 * Created by srikanth on 15/12/16.
 */
public class Car {
    //properties or Instance variables
    String model;
    String make;
    String weight;
    String color;

    //constructors are used to initialize the objects
    //default constructor, executed by default
    //method overloading:- methods with same name but different signature
    // signature:- number of arguments, order of arguments, type of arguments

    void message(){
        System.out.println("default one");
    }

    void message(int i){
        System.out.println("one integer as argument");
    }

    void message(String s){
        System.out.println("one String as argument");
    }

    void message(String s1, String s2){
        System.out.println("Two Strings as argument");
    }

    void message(String s, int i){
        System.out.println("one string and one integer as argument");
    }

    void message(int i, String s){
        System.out.println("one integer and one string as argument");
    }



    Car(){
        model = "AUDI X1";
        make = "AUDI Motors";
        color = "Black";
        weight = "6000";
    }

    //use of this
    Car(String model, String carColor, String carMake, String carWeight ){
        this.model = "Model is: "+model;
        this.color = carColor;
        this.make = carMake;
        this.weight = carWeight;
//        call the method after initialization of variables
        this.getCarDetails();
    }

    Car(String carModel, String carColor, String carMake){
        this.model = carModel;
        this.color = carColor;
        this.make = carMake;
        this.weight = "1000";
        //call the method after initialization of variables
        getCarDetails();
    }

    // methods
    void startCar(String carModel){
        System.out.println("Starting "+carModel+" car..");
    };

    void stopCar(){
        System.out.println("Stopping my car..");
    }

    void getCarDetails(){
        System.out.println("------------------------");
        System.out.println("Car Model: "+this.model);
        System.out.println("Car Make: "+this.make);
        System.out.println("Car Weight: "+this.weight);
        System.out.println("Car Color: "+this.color);
        System.out.println("------------------------");
    }

    void getCarDetails(Car c1){
        System.out.println("Car Model: "+c1.model);
        System.out.println("Car Make: "+c1.make);
        System.out.println("Car Weight: "+this.weight);
        System.out.println("Car Color: "+this.color);
    }



}
