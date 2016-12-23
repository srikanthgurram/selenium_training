package com.test.accessmodifiers;

/**
 * Created by srikanth on 23/12/16.
 */
public class PrivateClass {
    private String carModel = "XT 200";
    private String carMake = "Audi";

    /*
        Public methods
     */
    public void setCarDetails(String model, String make){
        setCarMake(make);
        setCarModel(model);
    }

    public void getCarDetails(){
        System.out.println("Car Make: "+carMake);
        System.out.println("Car Model: "+carModel);
    }

    /*
        Private Methods
     */
    private void setCarModel(String model){
        carModel = model;
    }

    private void setCarMake(String manufact){
        carMake = manufact;
    }
}
