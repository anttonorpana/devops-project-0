package utils;

import java.io.Console;

public class SleepCalculator {
    public static void CalculateSleepTime() {
        Console c = System.console();

        System.out.println("How old are you? Give anwer in whole years: ");
        Double age = Double.parseDouble(c.readLine());

        Double ageInDays = age * 365;
        Double ageInHours = ageInDays * 24;

        Double sleptTimeYears = 0.3333 * age;
        Double sleptTimeDays = 0.3333 * ageInDays;
        Double sleptTimeHours = 0.333 * ageInHours;

        System.out.println("You have slept:");
        System.out.println(sleptTimeYears + " years");
        System.out.println(sleptTimeDays + " days");
        System.out.println(sleptTimeHours + " hours");
    }
}
