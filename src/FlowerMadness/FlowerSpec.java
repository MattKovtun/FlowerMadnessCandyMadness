package FlowerMadness;

/**
 * Created by matt on 10/18/16.
 */
public class FlowerSpec {
    protected FlowerColor color = FlowerColor.NO_COLOR;
    protected double length = 0;
    protected Boolean fresh = false;
    protected double price = 0;
    protected FlowerType type = FlowerType.NO_TYPE;

    public FlowerType getType() {
        return type;
    }

    public void setType(FlowerType type) {
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

    public FlowerColor getColor() {
        return color;
    }

    public void setColor(FlowerColor color) {
        this.color = color;
    }

    public boolean isFresh() {
        return this.fresh;
    }

    public void setFresh(boolean fresh) {
        this.fresh = fresh;
    }

    public String toString() {
        return "Type: " + getType() + " price is " + String.valueOf(getPrice()) + " its color is " + getColor() + " fresh level is " + String.valueOf(isFresh()) + " its height " + String.valueOf(getLength());
    }


}
