package _02_classes_objects_static;

class Vehicle {
    static int wheels = 4;     // Same for all vehicles
    String color;              // Specific to each vehicle

    Vehicle(String color) {
        this.color = color;
    }

    void display() {
        System.out.println("Color: " + color + ", Wheels: " + wheels);
    }
}

public class StaticVsInstance {
    public static void main(String[] args) {
        Vehicle v1=new Vehicle("Red");
        Vehicle v2=new Vehicle("Blue");

        v1.display();
        v2.display();

        Vehicle.wheels=6;// Changing static field affects all objects

        v1.display();
        v2.display();
    }
}
