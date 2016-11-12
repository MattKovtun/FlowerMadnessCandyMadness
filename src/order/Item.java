package order;

/**
 * Created by matt on 11/7/16.
 */
abstract public class Item {
    String description;
    double price;
    abstract double price();
    abstract String getDescription();
}
