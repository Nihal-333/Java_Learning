package _04_interfaces_abstract_classes;

abstract class Animal {
    // Abstract method (no body)
    abstract void makeSound();

    // Concrete method
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barks");
    }
}

public class AbstractClassDemo {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.makeSound();
        a.eat();
    }
}