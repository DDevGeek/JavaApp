import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Objects;

public class Car {
    public static void main(String[] args) {

        // Car brands
        ArrayList<String> carBrands = new ArrayList<>();
        carBrands.add("Toyota");
        carBrands.add("Lambo");
        carBrands.add("Humer");
        carBrands.add("Musti");
        carBrands.add("Helliss");
        System.out.println(carBrands.size());
        System.out.println(carBrands.get(2));

        // Prime numbers
        ArrayList<Integer> primeNumbers = new ArrayList<>(6);
        primeNumbers.add(2);
        primeNumbers.add(3);
        primeNumbers.add(5);
        primeNumbers.add(7);
        primeNumbers.add(11);
        primeNumbers.add(13);
        System.out.println(primeNumbers);

        // creating an immutable array
        List<String> cityNames = Arrays.asList("city1", "city2", "city3");
//        cityNames.add("city4");
        cityNames.set(1, "Tegucigalpa");

        System.out.println(cityNames.get(1));

        List<String> kingsOfRome = new ArrayList<>(Arrays.asList("Romulus", "Numa Pompilius", "Tullus Hostilius", "Ancus Marcius", "Lucius Tarquinius Priscus", "Servius Tullius", "Lucius Tarquinius Superbus"));
        System.out.println(kingsOfRome);

        String[] kingsOfRomeArray = kingsOfRome.toArray(new String[0]);
        kingsOfRomeArray[6] = "Lucius Tarquinius Supercar";

        ArrayList<Integer> numbersOfDays = new ArrayList<>(Arrays.asList(1,2,4,5,6,7,7,8,8,8));
        numbersOfDays.add(100);

        Integer[] newNumbers = numbersOfDays.toArray(new Integer[0]);

        newNumbers[newNumbers.length - 2] = 200;

        System.out.println(Arrays.toString(newNumbers));
        System.out.println("Kings of rome array " + Arrays.toString(kingsOfRomeArray));

        ArrayList<String> greetings = new ArrayList<>(Arrays.asList("hello", "how are you", "speak", "let gooo"));
        String f = greetings.getFirst();
        String l = greetings.getLast();

        String[] myNewNames = greetings.toArray(new String[0]);
        System.out.println(f + " " + l);
        System.out.println(Arrays.toString(myNewNames));

        System.out.println("hello there");

        printFirstFibonacciNumbers();

    }

    public static void printFirstFibonacciNumbers() {
        int num1 = 0;
        int num2 = 1;
        int num3;
        for (int i = 0; i < 10; i++) {
            System.out.print(num1 + ", ");

            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;

        }

        String[] arr = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        for (int i = 0; i < arr.length; i = i + 2) {
            arr[i] = arr[i].toUpperCase();
        }

        System.out.println(Arrays.toString(arr));;
    }

}
