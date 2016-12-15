package com.test;
/**
 * Created by srikanth on 15/12/16.
 */
public class UserOfCar {
    public static void main(String[] args){

        //Created an instance/object for Car class
        Car fiatCar = new Car();
        fiatCar.color = "Creamy white";
        fiatCar.make = "Fiat";
        fiatCar.weight = "5000";
        fiatCar.model = "fiat punto";

        //print the details of Fiat
        fiatCar.getCarDetails();
        fiatCar.startCar(fiatCar.model);
        fiatCar.stopCar();
        System.out.println("------------------------");

        // Create another object for the Car class
        Car audiCar = new Car();
        audiCar.model = "AUDI X12";
        audiCar.color = "Black";
        audiCar.make = "AUDI Motors";
        audiCar.weight = "6000";

        //print details of Audi
        audiCar.getCarDetails();
        audiCar.startCar(audiCar.model);
        audiCar.stopCar();

    }
}
