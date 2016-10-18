package FlowerMadness;

/**
 * Created by matt on 10/3/16.
 */
abstract public class Flower {
    protected FlowerSpec spec;

    public void setType(FlowerType type) {
        spec.setType(type);
    }

    protected FlowerType getType() {
        return spec.getType();
    }


    public double getPrice() {
        return spec.getPrice();
    }

    public void setPrice(double price) {
        spec.setPrice(price);
    }

    public double getLength() {
        return spec.getLength();
    }

    public void setLength(double length) {
        spec.setLength(length);
    }

    public FlowerColor getColor() {
        return spec.getColor();
    }

    public void setColor(FlowerColor color) {
        spec.setColor(color);
    }

    public boolean isFresh() {
        return spec.isFresh();
    }

    public void setFresh(boolean fresh) {
        spec.setFresh(fresh);
    }

    public String toString() {
        return spec.toString();
    }

}
