package CandyMadness;

/**
 * Created by matt on 10/3/16.
 */
public class CandyGift {
    /*
    Class represents behaviour of box with candies
     */
    protected int defaultSize = 10;
    protected  int insertIndex = 0;

    protected  Candy[] a = new Candy[defaultSize];

    public void addCandy(Candy nw) {
        /*
        Add candy to the box
         */
        checkSize();
        a[insertIndex] = nw;             //nw  instance of new candy
        insertIndex ++;

    }

    private void checkSize() {
        /*
        If the candy box is full this function doubles the size
         */
        if (insertIndex == defaultSize - 1) {
            defaultSize *= 2;
            Candy[] b = new Candy[defaultSize];
            for (int i = 0; i <= insertIndex; i ++) {
                b[i] = a[i];
            }
            a = b;
        }
    }

    public void sortByWeight() {
        /*
        Sort all candies in box by its weight
         */
        for (int i = 1; i < insertIndex; i ++) {
            Candy tmp = a[i];
            int j = i - 1;
            while (j >= 0 && (a[i].getWeight() < a[j].getWeight())) {
                a[i] = a[j];
                j --;
            }
            a[j + 1] = tmp;
        }
    }
    public void sortByQuantity() {
        /*
        Sort all candies in box by its weight
         */
        for (int i = 1; i < insertIndex; i ++) {
            Candy tmp = a[i];
            int j = i - 1;
            while (j >= 0 && (a[i].getQuantity() < a[j].getQuantity())) {
                a[i] = a[j];
                j --;
            }
            a[j + 1] = tmp;
        }
    }

    public String toString() {
        /*
        Method which makes good print to console
         */
        String s = "";
        for (int i = 0; i < insertIndex; i ++) {
            s += a[i].toString() + "\n";
        }
        return s;
    }

}

