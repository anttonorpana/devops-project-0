package javaApp;

public class app {
    public static void main(String[] args) {
        System.out.println(getGreetingMessage("Developer"));
    }

    public static String getGreetingMessage(String name) {
        return "Hello, " + name + "!";
    }
}
