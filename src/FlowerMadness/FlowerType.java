package FlowerMadness;

/**
 * Created by matt on 10/18/16.
 */
public enum FlowerType {
    TULIP, POPPY, NO_TYPE;
    public String toString() {
        String s = "";
        switch (this) {
            case TULIP: s = "Tulip"; break;
            case POPPY: s = "Poppy"; break;
            }
        return s;
    }
}
