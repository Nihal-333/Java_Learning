package _04_interfaces_abstract_classes;

interface Drawable {
    void draw(); // implicitly public and abstract
}

class Circle implements Drawable {
    public void draw() {
        System.out.println("Drawing a Circle");
    }
    public void erase() {
        System.out.println("Erasing a Circle");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Drawable d=new Circle();
        d.draw();
        // d.erase(); It will give error because interface does not contain erase method
        Circle c=new Circle();
        c.erase();
        c.draw();
    }
}
