package CandyMadness;

/**
 * Created by matt on 10/3/16.
 */
public class CandyChocolate extends Candy{
    /*
    Class represents behaviour of a subclass of Candy, chocolate candy
     */
    public CandyChocolate(double weight, long quantity) {
        this.setType("Chocolate");
        this.setWeight(weight);
        this.setQuantity(quantity);

    }
}

