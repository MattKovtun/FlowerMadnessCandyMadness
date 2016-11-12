package order;

import FlowerMadness.FlowerBucket;
import FlowerMadness.FlowerSpec;

import java.util.ArrayList;

/**
 * Created by matt on 11/12/16.
 */
public class FlowerBucketDecorator extends FlowerBucket {
    private FlowerBucket fb;

    public FlowerBucketDecorator(FlowerBucket fb) {
        this.fb = fb;
    }
    public double getTotalPrice() {
        return fb.getTotalPrice() * 0.5;
    }
    public void addFlower(FlowerSpec spec) {
        fb.addFlower(spec);
    }
    public void sortByPrice(){
        fb.sortByPrice();
    }
    public String toString(){
        return fb.toString();
    }
    public FlowerSpec[] selectFlowersByItsLength(double start, double end) {
        return fb.selectFlowersByItsLength(start, end);
    }
    public ArrayList<FlowerSpec> findFlowers(FlowerSpec crt) {
        return fb.findFlowers(crt);
    }

}
