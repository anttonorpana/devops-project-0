package utils;

import java.io.Console;

public class SleepCalculator {
    public static void CalculateSleepTime() {
        Console c = System.console();

        System.out.println("How old are you? Give anwer in whole years: ");
        int age = Integer.parseInt(c.readLine());
    }
}
