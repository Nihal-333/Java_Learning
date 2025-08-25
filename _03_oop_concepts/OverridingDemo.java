package _03_oop_concepts;

class Shape {
    void draw() {
        System.out.println("Drawing shape");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing circle");
    }
}

public class OverridingDemo {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();// Output: Drawing circle
    }
}
