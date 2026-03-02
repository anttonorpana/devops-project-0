/**
 * Simple DevOps demo application.
 */
package com.example;

public class App {
    public static void main(String[] args) {
        System.out.println(getGreeting("Developer"));
    }

    public static String getGreeting(String name) {
        return "Hello, " + name + "!";
    }
}
