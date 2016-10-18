package FlowerMadness;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Created by matt on 10/3/16.
 */
public class FlowerBucket {
    private int defaultSize = 10;

    private int insertIndex = 0; // insert, or better create method length()
    private FlowerSpec[] a = new FlowerSpec[defaultSize];

    public void addFlower(FlowerSpec nw) {
        checkSize();
        a[insertIndex] = nw;
        insertIndex++;
    }

    private void checkSize() {
        if (insertIndex == defaultSize - 1) {
            defaultSize *= 2;
            FlowerSpec[] b = new FlowerSpec[defaultSize];
            for (int i = 0; i <= insertIndex; i++) {
                b[i] = a[i];
            }
            a = b;
        }
    }

    public void sortByPrice() {
        for (int i = 1; i < insertIndex; i++) {
            FlowerSpec tmp = a[i];
            int j = i - 1;
            while (j >= 0 && (a[i].getPrice() < a[j].getPrice())) {
                a[i] = a[j];
                j--;
            }
            a[j + 1] = tmp;
        }
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < insertIndex; i++) {
            s += a[i].toString() + "\n";
        }
        return s;
    }

    public double getTotalPrice() {
        double sum = 0;
        for (int i = 0; i < insertIndex; i++) {
            sum += a[i].getPrice();
        }
        return sum;
    }

    public FlowerSpec[] selectFlowersByItsLength(double start, double end) {
        int tmpSize = 0;
        for (int i = 0; i < insertIndex; i++) {
            if (a[i].getLength() <= end && a[i].getLength() >= start) {
                tmpSize++;
            }
        }
        FlowerSpec[] tmpPart = new FlowerSpec[tmpSize];
        int tmpIndex = 0;
        for (int i = 0; i < insertIndex; i++) {
            if (a[i].getLength() <= end && a[i].getLength() >= start) {
                tmpPart[tmpIndex] = a[i];
                tmpIndex++;
            }
        }
        return tmpPart;
    }

    public ArrayList<FlowerSpec> findFlowers(FlowerSpec crt) {
        ArrayList<FlowerSpec> part = new ArrayList<>();
        for (int i = 0; i < insertIndex; ++i) {
            if (a[i].getType() == crt.getType() || crt.getType() == FlowerType.NO_TYPE)
                if (a[i].getPrice() <= crt.getPrice() || crt.getPrice() == 0) {
                    if (Objects.equals(a[i].isFresh(), crt.isFresh()) || Objects.equals(crt.isFresh(), false)) {
                        if (a[i].getLength() == crt.getLength() || crt.getLength() == 0) {
                            if (a[i].getColor() == crt.getColor() || crt.getColor() == FlowerColor.NO_COLOR) {
                                part.add(a[i]);
                            }
                        }
                    }
                }
        }
        return part;
    }
}