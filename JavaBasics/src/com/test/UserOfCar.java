package com.test;
/**
 * Created by srikanth on 15/12/16.
 */
public class UserOfCar {
    public static void main(String[] args){

        //Created an instance/object for Car class
        Car fiatCar = new Car("Creamy white","Fiat","5000","fiat punto");
        fiatCar.startCar(fiatCar.model);
        fiatCar.stopCar();

        // Create another object for the Car class
        Car audiCar = new Car();

        //print details of Audi
        audiCar.getCarDetails();
        audiCar.startCar(audiCar.model);
        audiCar.stopCar();

        //create another object for car class
        Car tataCar = new Car("Nano","White","M&M Motors");

        tataCar.message();
        tataCar.message(100);
        tataCar.message("Hello");
        tataCar.message("Hello", 100);
        tataCar.message(100, "Hello");
        tataCar.message("Helo", "How are you?");

        //Create another object
        Car suzuki = new Car("BLUE","SUZUKI","3000","Suzuki Elantra");
        suzuki.getCarDetails();

        getCarDetails();

        suzuki.getCarDetails(tataCar);


    }
    static void getCarDetails(){
        System.out.println("THis call is from outside method....");
    }

}
