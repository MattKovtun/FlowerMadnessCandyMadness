package FlowerMadness;

/**
 * Created by matt on 10/18/16.
 */
public enum FlowerColor {
    BLACK, RED, GREEN, WHITE, YELLOW, NO_COLOR;
    public String toString() {
        String s = "";
        switch (this) {
            case GREEN: s = "Green"; break;
            case BLACK: s = "Black"; break;
            case RED: s = "Red"; break;
            case WHITE: s = "White"; break;
            case YELLOW: s = "Yellow"; break;
        }
        return s;
    }
}
