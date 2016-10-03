package FlowerMadness;

/**
 * Created by matt on 10/3/16.
 */
public class FlowerPoppy extends Flower {

    public FlowerPoppy(double length, Boolean fresh) {
        this.type = "Poppy";
        this.color = "Red";
        this.length = length;
        this.fresh = fresh;
        this.price = 10;
    }
}
