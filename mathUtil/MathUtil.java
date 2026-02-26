/**
 * Utility class that provides comparison methods
 * for primitive numeric types.
 * <p>
 * Includes overloaded methods to determine the larger
 * or smaller value between two numbers.
 */
public class MathUtil {
    public int bigger(int a, int b) {
        return a >= b ? a : b;
    }

    public float bigger(float a, float b) {
        return a >= b ? a : b;
    }

    public double bigger(double a, double b) {
        return a >= b ? a : b;
    }

    public int smaller(int a, int b) {
        return a <= b ? a : b;
    }

    public float smaller(float a, float b) {
        return a <= b ? a : b;
    }

    public double smaller(double a, double b) {
        return a <= b ? a : b;
    }
}
