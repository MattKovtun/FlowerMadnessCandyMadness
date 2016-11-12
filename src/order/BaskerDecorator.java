package order;

/**
 * Created by matt on 11/7/16.
 */
public class BaskerDecorator extends ItemDecorator{
    @Override
    double price() {
        return 4 + item.price();
    }

    @Override
    String getDescription() {
        return null;
    }
}
