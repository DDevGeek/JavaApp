import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Numbers {
    static Scanner scanner = new Scanner(System.in);
    static int userGuess;

    public static void main(String[] args) {
//        guessNumber();
//        DayNumber FullMonthName Last2DigitsOfYearNumber HourTime MinuteTime
//        LocalDateTime localDateTime = LocalDateTime.now();
//        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd MMMM yy hh:mm");
//
//        System.out.print("Time is " + dateTimeFormatter.format(localDateTime));
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd MMMM yy hh:mm");
        String formatedDateTime = dateFormatter.format(dateTime);

        System.out.println("Today is: " + formatedDateTime);


        Person person = new Person();
        person.setName("Declan");
        person.setAge(100);
        person.getName();
        person.getAge();
    }

    public static void guessNumber() {
        System.out.println("Welcome to check Number");
        System.out.println();
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

class Person {
    String name;
    int age;
    int counter;

//    public Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        System.out.println("Hello my Name is: " + name);
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        System.out.println("Hello my age is: " + age + " year old");
        return age;
    }

    public void displayName() {
        System.out.println("Hello my Name is: " + name);
    }

    public void displayAge() {
        System.out.println("Hello my age is: " + age + " year old");
    }

    public void totalPeople() {
        counter++;
    }
}
