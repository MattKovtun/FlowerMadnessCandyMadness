package order;

/**
 * Created by matt on 11/7/16.
 */
abstract public class ItemDecorator extends Item{
    Item item;
    String description;
    abstract String getDescription();

}
