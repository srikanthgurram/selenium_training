package com.test.accessmodifiers;

/**
 * Created by srikanth on 30/12/16.
 */
public class ProtectClassExt extends ProtectClass {
    public static void main(String[] args){
        /*
            Protect variables & methods can be accessed from sub class
         */

        /*
            static:
                - can be used to share the data across the objects
                - i.e. it preserves the data between different object calls
                - changes to a static variable in one object will reflect in another

                - static variables are also called class variables
                - static methods are also called class methods

                - static variables or methods can be accessed without the object
         */


        //call start counter method
        ProtectClassExt pte = new ProtectClassExt();
        System.out.println("Static Counter in super class = "+static_count);
        System.out.println("Counter in super class = "+pte.count);

        static_count = 0;
        for(int i=0;i<5;i++){
            // call method in super class
//            pte.incrementCount();
            static_count = i;
            pte.count = i;

            System.out.println("pte.static_count = "+static_count);
            System.out.println("pte.count = "+pte.count);
        }

        static_count = 100;
        pte.count = 100;

        System.out.println("pte.static_count  with object name = "+pte.static_count);
        System.out.println("pte.static_count without object name = "+static_count);
        System.out.println("pte.count  = "+pte.count);

        // create another object for the sub class
        ProtectClassExt pte2 = new ProtectClassExt();
//        pte2.static_count = 20;
        System.out.println("pte2.static_count  = "+static_count);
        System.out.println("pte2.count  = "+pte2.count);

        for(int i=0;i<5;i++){
            // call method in super class
            incrementCount();
        }
//        System.out.println("Resetting the counter");
//        pte2.static_count = 0;

        // create another object for the sub class
        ProtectClassExt pte3 = new ProtectClassExt();
//        pte3.static_count = 50;
        System.out.println("pte3.static_count  = "+static_count);
        System.out.println("pte3.count  = "+pte3.count);
        for(int i=0;i<5;i++){
            // call method in super class
            incrementCount();
        }

    }
}
