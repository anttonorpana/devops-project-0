import static utils.Prints.print;
import static utils.Prints.println;

public class ExamplePrints {
    public static void main(String[] args) {
        print("I want to "); // This print doesn't make newline at the end
        println("eat ice cream"); // So this continues in the same line
        println(); // This prints nothing but makes a newline at the end
        println("What do you want to eat?"); // So this will be seperated from the upper ones
    }
}