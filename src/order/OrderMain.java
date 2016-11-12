package order;

import FlowerMadness.FlowerBucket;
import FlowerMadness.FlowerColor;
import FlowerMadness.FlowerSpec;
import FlowerMadness.FlowerType;

/**
 * Created by matt on 11/12/16.
 */
public class OrderMain {
    public static void main(String agrs[]){
        System.out.println("Forming bucket ... ");
        FlowerBucket someBucket = new FlowerBucket();
        FlowerSpec poppy = new FlowerSpec();
        poppy.setFresh(false);
        poppy.setPrice(2016);
        poppy.setType(FlowerType.POPPY);
        poppy.setColor(FlowerColor.RED);
        poppy.setLength(120);
        someBucket.addFlower(poppy);
        System.out.println("Bucket is formed ... ");
        System.out.println(someBucket);
        System.out.println("Creating an order ...");


        Order myOrder = new Order();
        myOrder.setDelivery(new DHLDelivery());
        myOrder.setPayment(new CreditCardPayment());
        myOrder.addItem(someBucket);
        System.out.println("Processing order ...");
        myOrder.proccessOrder();
        System.out.println("Order completed!");
    }

}
