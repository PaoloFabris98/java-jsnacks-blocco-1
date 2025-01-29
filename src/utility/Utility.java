package utility;

public class Utility {

    public static void belowEqualZero(int i) {
        if (i <= 0) {
            if (i < 0) {
                throw new IllegalArgumentException("Il dato indicato non può essere inferiore o uguale a zero.");
            }
        }
    }

    public static void belowZero(int i) {
        if (i < 0) {
            if (i < 0) {
                throw new IllegalArgumentException("Il dato indicato non può essere inferiore a zero.");
            }
        }
    }

    public static Boolean isDead(int i, int puntiFerita) {
        return ((puntiFerita - i) <= 0);
    }

}
