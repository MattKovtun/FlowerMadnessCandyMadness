package CandyMadness;

/**
 * Created by matt on 10/3/16.
 */
public class Candy {
    /*
    Parent class for all Candies, with basic attributes, getters and setters
    this class used like an abstract class
     */

    protected String type;
    protected double weight;
    protected long quantity;
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public String toString() {
        return "Type is: " + getType() + " weight is: " + getWeight() + " quantity is: " + getQuantity();

    }


}
