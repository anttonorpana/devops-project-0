package javaApp;

/**
 * Simple greeting
 */
public class app {
    public static void main(String[] args) {
        String name = args.length > 0 ? args[0] : "Developer";
        System.out.println(getGreetingMessage(name));
    }

    public static String getGreetingMessage(String name) {
        if (name == null || name.isBlank()) {
            name = "Developer";
        }
        return "Hello, " + name + "!";
    }
}
