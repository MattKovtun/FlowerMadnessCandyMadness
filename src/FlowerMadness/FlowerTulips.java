package FlowerMadness;

/**
 * Created by matt on 10/3/16.
 */
public class FlowerTulips extends Flower{

    public FlowerTulips(String color, double length, Boolean fresh) {
        this.setType("Tulip");
        this.setColor(color);
        this.setLength(length);
        this.setFresh(fresh);
        this.setPrice(20);
    }

}
