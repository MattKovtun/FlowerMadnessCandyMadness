package FlowerMadness;

/**
 * Created by matt on 10/3/16.
 */
public class FlowerPoppy extends Flower {

    public FlowerPoppy(double length, Boolean fresh) {
        this.setType("Poppy");
        this.setColor("Red");
        this.setLength(length);
        this.setFresh(fresh);
        this.setPrice(10);
    }
}
