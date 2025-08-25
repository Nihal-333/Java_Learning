// 6. Default & Static Methods in Interfaces

package _07_java8features;
interface MyInterface {
    default void show() {
        System.out.println("Default implementation");
    }

    static void utility() {
        System.out.println("Static method in interface");
    }
}

public class InterfaceFeatures implements MyInterface {
    public static void main(String[] args) {
        InterfaceFeatures obj = new InterfaceFeatures();
        obj.show();
        MyInterface.utility(); // Calling static method
    }
}
