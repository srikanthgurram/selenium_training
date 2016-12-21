package com.test.inheritance.multi_level;

/**
 * Created by srikanth on 15/12/16.
 */
public class Car {
    //properties or Instance variables
    public String model;
    public String make;
    public String weight;
    public String color;

    //constructors are used to initialize the objects
    //default constructor, executed by default
    //method overloading:- methods with same name but different signature
    // signature:- number of arguments, order of arguments, type of arguments

    public void message(){
        System.out.println("default one");
    }

    public void message(int i){
        System.out.println("one integer as argument");
    }

    public void message(String s){
        System.out.println("one String as argument");
    }

    public void message(String s1, String s2){
        System.out.println("Two Strings as argument");
    }

    public void message(String s, int i){
        System.out.println("one string and one integer as argument");
    }

    public void message(int i, String s){
        System.out.println("one integer and one string as argument");
    }

    public Car(){
        model = "AUDI X1";
        make = "AUDI Motors";
        color = "Black";
        weight = "6000";
    }

    //use of this
    public Car(String model, String carColor, String carMake, String carWeight ){
        this.model = "Model is: "+model;
        this.color = carColor;
        this.make = carMake;
        this.weight = carWeight;
//        call the method after initialization of variables
        this.getCarDetails();
    }

    public Car(String carModel, String carColor, String carMake){
        this.model = carModel;
        this.color = carColor;
        this.make = carMake;
        this.weight = "1000";
        //call the method after initialization of variables
        getCarDetails();
    }

    // methods
    public void startCar(String carModel){
        System.out.println("Starting "+carModel+" car..");
    };

    public void stopCar(){
        System.out.println("Stopping my car..");
    }

    public void getCarDetails(){
        System.out.println("------------------------");
        System.out.println("Car Model: "+this.model);
        System.out.println("Car Make: "+this.make);
        System.out.println("Car Weight: "+this.weight);
        System.out.println("Car Color: "+this.color);
        System.out.println("------------------------");
    }

    public void getCarDetails(Car c1){
        System.out.println("Car Model: "+c1.model);
        System.out.println("Car Make: "+c1.make);
        System.out.println("Car Weight: "+this.weight);
        System.out.println("Car Color: "+this.color);
    }



}
