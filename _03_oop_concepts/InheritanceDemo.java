package _03_oop_concepts;

class Animal{
    void sound(){
        System.out.println("Animal makes sound");
    };
    void eat(){
        System.out.println("Animal eat meat");
    };
}

class Dog extends Animal{
    void sound() {
        System.out.println("Dog barks");
    }
}
public class InheritanceDemo {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.sound();// Output: Dog barks
        d.eat();;// Output: Animal eat meat
    }
}
