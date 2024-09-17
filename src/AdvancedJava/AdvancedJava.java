package AdvancedJava;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class AdvancedJava {
    public static void main(String[] args) {
        Set<String> daysOfWeek = new HashSet<>();
        Set<String> newDaysOfWeek = new LinkedHashSet<>();

        daysOfWeek.add("Monday");
        daysOfWeek.add("Tuesday");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Thursday");
        daysOfWeek.add("Friday");
        daysOfWeek.add("Saturday");
        daysOfWeek.add("Sunday");
        System.out.println("Hash Set " + newDaysOfWeek);

        newDaysOfWeek.add("Monday");
        newDaysOfWeek.add("Tuesday");
        newDaysOfWeek.add("Wednesday");
        newDaysOfWeek.add("Thursday");
        newDaysOfWeek.add("Friday");
        newDaysOfWeek.add("Saturday");
        newDaysOfWeek.add("Sunday");

        System.out.println("Liked Hash Set " + newDaysOfWeek);
        System.out.println("Is the first Set equal to the second one?" + daysOfWeek.equals(newDaysOfWeek));

    }
}