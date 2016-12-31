package com.test.accessmodifiers;

/**
 * Created by srikanth on 31/12/16.
 */
public class FinalUser {
    public static void main(String[] args){
        FinalClass fu = new FinalClass();

        System.out.println("incrementing counter from zero");
        //incrementing value of counter
        for(int i=0;i<10;i++){
            fu.incrementCounter();
        }
        System.out.println("Counter = "+fu.counter);
        System.out.println("Decrementing Counter value from "+fu.counter);

        for(int i=0;i<10;i++){
            fu.decrementCounter();
        }

        System.out.println("Finally my value in Counter is "+fu.counter);


    }
}
