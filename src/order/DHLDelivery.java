package order;

import java.util.LinkedList;

/**
 * Created by matt on 11/7/16.
 */
public class DHLDelivery implements IDelivery {
    @Override
    public void deliver(LinkedList items) {
        System.out.println("Your order will be delivered via DHL ");

    }
}
