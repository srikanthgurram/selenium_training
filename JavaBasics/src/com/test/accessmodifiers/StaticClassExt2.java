package com.test.accessmodifiers;

/**
 * Created by srikanth on 30/12/16.
 */
public class StaticClassExt2 extends ProtectClass {


    /*
       static:
        - can be used to share the data across the objects
        - i.e. it preserves the data between different object calls
        - changes to a static variable in one object will reflect in another

        - static variables are also called class variables
        - static methods are also called class methods
        - static variables or methods can be accessed without the object

        -   static variables or methods can be accessed without instance
        -   static method accepts only static variables
        -   you cannot use non-static variables with in a static method
        -   However, you can access non-static content using object/instance
        -   You can access class variables or methods directly using the Class name
     */
    public static void main(String[] args){
        for(int i=0;i<5;i++){
            // call method in super class
            incrementCount();
            System.out.println("counter = "+static_count);
        }

    }
}
