package _03_oop_concepts;

abstract class Vehicle {
    abstract void start();

    void fuel() {
        System.out.println("Fueling the vehicle");
    }
}

class Bike extends Vehicle {
    void start() {
        System.out.println("Bike started with key");
    }
}

public class AbstractionDemo {
    public static void main(String[] args) {
        Vehicle v = new Bike();
        v.start();
        v.fuel();
    }
}
