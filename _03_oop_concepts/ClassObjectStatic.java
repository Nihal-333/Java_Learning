package _03_oop_concepts;

class Car {
    static String brand = "Toyota";  // static
    String model;                    // instance

    Car(String model) {
        this.model = model;
    }

    void showDetails() {
        System.out.println("Brand: " + brand + ", Model: " + model);
    }

    static void showBrand() {
        System.out.println("Car brand: " + brand);
    }
}

public class ClassObjectStatic {
    public static void main(String[] args) {
        Car c1 = new Car("Corolla");
        Car c2 = new Car("Camry");

        c1.showDetails();
        c2.showDetails();

        Car.showBrand();  // static method call
    }
}
