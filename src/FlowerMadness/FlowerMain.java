package FlowerMadness;

import order.FlowerBucketDecorator;

import java.util.Arrays;

/**
 * Created by matt on 10/3/16.
 */
public class FlowerMain {

    public static void main(String args[]) {
        FlowerBucket bucket = new FlowerBucket();
        FlowerSpec tulip = new FlowerSpec();
        tulip.setType(FlowerType.TULIP);
        tulip.setFresh(true);
        tulip.setPrice(100500);
        tulip.setColor(FlowerColor.WHITE);
        bucket.addFlower(tulip);

        FlowerSpec tulip2 = new FlowerSpec();
        tulip2.setPrice(1337);
        tulip2.setFresh(true);
        tulip2.setType(FlowerType.TULIP);
        tulip2.setColor(FlowerColor.YELLOW);
        bucket.addFlower(tulip2);

        FlowerSpec poppy = new FlowerSpec();
        poppy.setFresh(false);
        poppy.setPrice(2016);
        poppy.setType(FlowerType.POPPY);
        poppy.setColor(FlowerColor.RED);
        poppy.setLength(120);
        bucket.addFlower(poppy);


        FlowerSpec poppy2 = new FlowerSpec();
        poppy2.setColor(FlowerColor.WHITE);
        poppy2.setPrice(1);
        poppy2.setLength(228);
        bucket.addFlower(poppy2);


        System.out.println(bucket);
        System.out.println("Sorting by price...");
        bucket.sortByPrice();
        System.out.println(bucket);
        System.out.println("The total price of the bucket is: " + String.valueOf(bucket.getTotalPrice()));
        System.out.println(Arrays.toString(bucket.selectFlowersByItsLength(105, 120)));
        System.out.println();

        System.out.println("TEST #1");
        System.out.println("Regular test, with empty categories");
        FlowerSpec TEST1 = new FlowerSpec();
        System.out.println(bucket.findFlowers(TEST1));
        System.out.println();


        System.out.println("TEST #2");
        System.out.println("Test with just price");
        FlowerSpec TEST2 = new FlowerSpec();
        TEST2.setPrice(2);
        System.out.println(bucket.findFlowers(TEST2));
        System.out.println();

        System.out.println("Testing decorator ");
        System.out.println("Total price of regular bucket is : " + bucket.getTotalPrice());
        FlowerBucketDecorator VIPfb = new FlowerBucketDecorator(bucket);
        System.out.println("Total price of the same bucket but for VIP clients is : " + VIPfb.getTotalPrice());


    }
}
