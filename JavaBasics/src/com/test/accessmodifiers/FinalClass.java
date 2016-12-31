package com.test.accessmodifiers;

/**
 * Created by srikanth on 31/12/16.
 */

/*
    When a variable is declared as final, it means is a constant
    We cannot assign values dynamically to a constant
    However, we can assign some value at the time of declaration
 */

public final class FinalClass {
    final int MAX_COUNT = 5;
    final int MIN_COUNT = 2;
    int counter = 0;

    void incrementCounter(){
        if(counter > MAX_COUNT){
            System.out.println("Reached maximum value, cannot increment");
        }else{
            counter += 1; // equivalent to counter = counter + 1
        }
        // if counter reaches maximum value alert user
        System.out.println("++ count to "+counter);
    }

    void decrementCounter(){
        if(counter <= MIN_COUNT){
            System.out.println("Reached minimum value, cannot decerement");
        }else{
            counter -= 1; // counter = counter - 1
        }
        System.out.println("-- count to "+counter);
    }
}
