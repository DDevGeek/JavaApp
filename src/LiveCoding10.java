import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LiveCoding10 {
    public static void main(String[] args) {
        ArrayList<Integer> primeNumbers = new ArrayList<>(6);
        ArrayList<Integer> manyNumbers = new ArrayList<>(Arrays.asList(2,3,4,5,6,7,8,9,100));
        ArrayList<Persons> myPeople = new ArrayList<>();

        myPeople.add(new Persons());
        myPeople.add(new Employee());
        primeNumbers.add(2);
        
        primeNumbers.add(3);
        primeNumbers.add(-5);
        primeNumbers.add(7);
        primeNumbers.add(-11);
        primeNumbers.add(13);
        replaceNegativeNumbersWithZero(primeNumbers);
        reverseList(manyNumbers);
//        System.out.println("Exchange rate time ");
//        System.out.println("=====================");
//        System.out.println(exchangeRate());
//        System.out.println("fibonacci numbers are -  ");
//        fibonacciNumbers();

        System.out.println("Print my car modal");
        Cars myCar = new Cars();
        System.out.println(myCar.brand);
        System.out.println(myCar.modal);

        System.out.println("Guess number");
        myCar.guessNumber();
    }

    public static void replaceNegativeNumbersWithZero(ArrayList<Integer> numbers) {
        for (int number : numbers) {
            if (number < 0) {
                numbers.set(numbers.indexOf(number), 0);
            }
        }

        System.out.println(numbers);
    }

    public static void reverseList(ArrayList<Integer> numbers) {
        System.out.println("Unreversed" + numbers);

        for (int i = numbers.size() - 1; i > 0; i--) {
            int index = numbers.get(i);
            System.out.println(index);
            numbers.remove((Integer) index);
            numbers.addFirst(index);
        }

        System.out.println("Reversed one " + numbers);

    }


    public static int exchangeRate() {
        double botCurrentBalance = 10000.0;
        int counter = 0;

        while(botCurrentBalance > 0) {
            double exchangeRate = 1 + (Math.random() * 0.2);

            if (exchangeRate > 1.15) {
                botCurrentBalance = botCurrentBalance - 1000;
                counter++;
            }
            System.out.println(botCurrentBalance);
        }

        return counter;
    }

    public static void fibonacciNumbers() {
        int num1 = 0;
        int num2 = 1;
        int num3;
        int counter = 10;

        System.out.print(num1 + ", " + num2 + ", ");
        while (counter > 0) {
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            System.out.print(num3 + ", ");
            counter--;
        }
    }

}

class Cars {
    String brand = "Toyota";
    String modal = "Hummer";

    public void guessNumber() {
        Scanner scanner = new Scanner(System.in);
        int userGuess;

        System.out.print("Welcome to check Number");
        while (true) {
            int numbers = (int) (1 + Math.random() * 10);
            System.out.print("Guess number: - ");
            userGuess = scanner.nextInt();
            if (numbers == userGuess) {
                System.out.println("Congratulations");
                return;
            }
        }
    }
}

class Employee extends Persons {
    String name;
    byte age;
    byte position;

    public Employee(String name, byte age) {
        this.name = name;
        this.age = age;
    }

    public Employee(String name, byte position, byte age) {
        this.name = name;
        this.age = age;
        this.position = position;
    }

    public Employee() {

    }


    @Override
    public void printDetails() {
        System.out.println("This is an override of the method from person");
    }
}

class Persons {


    public void printDetails() {
        System.out.println("This is from the person class");
    }
}


class Manager extends Persons {
    @Override
    public void printDetails() {
        System.out.println("am overriding the employee");
    }
}




