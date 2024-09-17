package AdvancedJava;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class AdvancedJava {
    public static void main(String[] args) {
        Set<Integer> myNumbers = new HashSet<>();
        Set<String> myNames = new LinkedHashSet<>();
        Set<Integer> myNumber2 = new LinkedHashSet<>();
        Pattern myPatt = new Pattern();
        myPatt.printPattern();


        myNumber2.add(1);
        myNumber2.add(3);
        myNumber2.add(4);
        myNumber2.add(2);
        myNumber2.add(2);
        myNumber2.add(2);
        myNumber2.add(2);

        myNames.add("hello");
        myNames.add("hello");
        myNames.add("Construire");
        myNames.add("Devoire");
        myNames.add("How");
        myNames.add("Avoire");

        System.out.println(myNumber2);
    }
}












class NewAdvJava {
    Set<Integer> number = new HashSet<>();
    Set<String> names = new LinkedHashSet<>();
}
