package javaApp;

public class app {
    public static void main(String[] args) {
        System.out.println(getGreetingMessage("Developer"));
    }

    public static String getGreetingMessage(String name) {
        if (name == null || name.isBlank()) {
            name = "Developer";
        }
        return "Hello, " + name + "!";
    }
}
