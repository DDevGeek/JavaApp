public class Main {
    public static void main(String[] args) {
        Dog blueDog = new Dog("Blue", 12);
        blueDog.makeSound();
        blueDog.eat();

        System.out.println();
        Bird greedy = new Bird("Greedy", 12, "greed");
        greedy.makeSound();
        greedy.eat();

        System.out.println();
        Cat idefix = new Cat("Idefix", 12, "white");
        idefix.eat();
        idefix.makeSound();

        Teacher him = new Teacher();
        him.getOccupation();
        String username = him.username;
        System.out.println(" the username is " + username);
    }
}

class Pers {
    String name;

    public void getOccupation() {}
}

class Teacher extends Pers {
    String name;
    protected String username = "Teacher";

    @Override
    public void getOccupation() {
        System.out.println(name + " is a teacher");
    }

}

class Student extends Pers {
    protected String name;

    @Override
    public void getOccupation() {
        System.out.println(name + " is a Student");
    }
}

//private
//protected
//public
