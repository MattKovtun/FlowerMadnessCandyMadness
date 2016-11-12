package order;

/**
 * Created by matt on 11/7/16.
 */
public class PaperDecorator extends ItemDecorator{
    Item item;
    @Override
    double price() {
        return 13 + item.price();
    }

    @Override
    String getDescription() {
        return null;
    }
}
