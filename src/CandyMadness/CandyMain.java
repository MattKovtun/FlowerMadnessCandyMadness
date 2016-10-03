package CandyMadness;

import java.util.Arrays;

/**
 * Created by matt on 10/3/16.
 */
public class CandyMain {
    /*
    Test for Homework with candies
     */
    public static void main(String args[]) {

        CandyGift pack = new CandyGift();       // create a box of candies
        CandyLollipop chupa1 = new CandyLollipop(10, 1000);   // instance of class
        CandyLollipop chupa2 = new CandyLollipop(2, 900);
        CandyLollipop chupa3 = new CandyLollipop(7, 120);
        CandyChocolate choco1 = new CandyChocolate(100, 23);
        CandyChocolate choco2 = new CandyChocolate(120, 9);
        CandyChocolate choco3 = new CandyChocolate(108, 46);
        System.out.println("Adding candies to pack...");
        pack.addCandy(chupa1);  // adding all candies to box
        pack.addCandy(chupa2);
        pack.addCandy(chupa3);
        pack.addCandy(choco1);
        pack.addCandy(choco2);
        pack.addCandy(choco3);
        System.out.println(pack);
        System.out.println("Sorting by weight...");
        pack.sortByWeight();        // sort method
        System.out.println(pack);
        System.out.println("Sorting by quantity...");
        pack.sortByQuantity();      // sort method
        System.out.println(pack);
    }
}
