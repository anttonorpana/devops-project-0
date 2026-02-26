/**
 * Utility class that provides simplified wrapper methods
 * around {@link System#out} printing operations.
 */
public class Prints {
    /**
     * Prints a newline to the standard output.
     * Equivalent to {@link System#out#println()}.
     */
    public void Println() {
        System.out.println();
    }

    public void Println(String s) {
        System.out.println(s);
    }

    public void Print(String s) {
        System.out.print(s);
    }
}
