package order;

/**
 * Created by matt on 11/7/16.
 */
public class PayPalPayment implements IPayment{
    @Override
    public void pay(double price) {
        System.out.println("Price of your order is " + Double.toString(price));
        System.out.println("You've payed with PayPal ");
    }
}
