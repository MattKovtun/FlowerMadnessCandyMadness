package FlowerMadness;

import java.util.Arrays;

/**
 * Created by matt on 10/3/16.
 */
public class FlowerMain {

    public static void main(String args[]) {
        FlowerBucket bucket = new FlowerBucket();
        FlowerPoppy mak = new FlowerPoppy(100, true);
        FlowerTulips tulpan1 = new FlowerTulips("Yellow", 120, false);
        FlowerTulips tulpan2 = new FlowerTulips("Green", 105, false);


        bucket.addFlower(tulpan1);
        bucket.addFlower(mak);
        bucket.addFlower(tulpan2);
        System.out.println(bucket);
        System.out.println("Sorting by price...");
        bucket.sortByPrice();
        System.out.println(bucket);
        System.out.println("The total price of the bucket is: " + String.valueOf(bucket.getTotalPrice()));
        System.out.println(Arrays.toString(bucket.selectFlowersByItsLength(105, 120)));

    }
}
