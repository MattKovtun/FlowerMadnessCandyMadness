package FlowerMadness;

/**
 * Created by matt on 10/3/16.
 */
public class Flower {
    protected String color;
    protected double length;
    protected boolean fresh;
    protected double price;
    protected String type;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFresh() {
        return fresh;
    }

    public void setFresh(boolean fresh) {
        this.fresh = fresh;
    }
    public String toString(){
        return "Type: " + getType() + " price is " + String.valueOf(getPrice()) + " its color is " + getColor() + " fresh leve is " + String.valueOf(isFresh()) + " its height " + String.valueOf(getLength());
    }

}
