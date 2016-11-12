package order;

import FlowerMadness.FlowerBucket;

import java.util.LinkedList;

/**
 * Created by matt on 11/7/16.
 */
public class Order {
    private LinkedList<FlowerBucket> items;
    private IPayment payment;
    private IDelivery delivery;

    public Order() {
        items = new LinkedList<>();

    }
    public void addItem(FlowerBucket bucket) {
        items.add(bucket);
    }

    public double calculateTotalPrice() {
        double price = 0;
        for (int i = 0; i < items.size(); ++i){
            price += items.get(i).getTotalPrice();
        }
        return price;
    }
    public void removeItem(FlowerBucket item){
        items.remove(item);
    }
    public IDelivery getDelivery() {
        return delivery;
    }

    public void setDelivery(IDelivery delivery) {
        this.delivery = delivery;
    }

    public IPayment getPayment() {
        return payment;
    }

    public void setPayment(IPayment payment) {
        this.payment = payment;
    }

    public void proccessOrder() {
        if (payment != null){
        payment.pay(calculateTotalPrice());}
        delivery.deliver(items);
    }

}
