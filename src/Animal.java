public class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {}

    public void makeSound() {};
}

class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(this.name + " eat meat");
    }

    @Override
    public void makeSound() {
        System.out.println(this.name + " Make woff sounds");
    }
}

class Cat extends Animal {
    String color;

    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    @Override
    public void eat() {
        System.out.println(this.name + " eat meat");
    }

    @Override
    public void makeSound() {
        System.out.println(this.name + " Make loud sounds and is of " + color + " color");
    }
}

class Bird extends Animal {
    String color;

    public Bird (String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    @Override
    public void eat() {
        System.out.println(this.name + " eat insect and it has " + color + " color");
    }

    @Override
    public void makeSound() {
        System.out.println(this.name + " Make loud souds");
    }
}
