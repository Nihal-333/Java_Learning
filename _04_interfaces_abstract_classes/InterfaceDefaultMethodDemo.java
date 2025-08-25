package _04_interfaces_abstract_classes;

interface MyInterface {
    void show();

    default void log() {
        System.out.println("Logging from interface");
    }

    static void printVersion() {
        System.out.println("Interface version 1.0");
    }
}

class MyClass implements MyInterface {
    public void show() {
        System.out.println("Showing something...");
    }
}

public class InterfaceDefaultMethodDemo {
     public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.show();
        obj.log();                // default method
        MyInterface.printVersion(); // static method
    }
}
