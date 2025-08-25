//2. Functional Interfaces

package _07_java8features;

@FunctionalInterface
interface Greeting {
    void sayHello(String name);    
}

public class FunctionalInterfaceDemo {
    public static void main(String[] args){
        Greeting g=(name)->System.out.println("Hello, "+name);
        g.sayHello("Nihal");
    }
}
