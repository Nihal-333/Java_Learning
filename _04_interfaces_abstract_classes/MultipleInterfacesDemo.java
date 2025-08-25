package _04_interfaces_abstract_classes;

interface Flyable{
    void fly();
}

interface Swimmable{
    void swim();
}

class Duck implements Flyable,Swimmable{
    public void fly(){
        System.out.println("Duck flies for short distance");
    }
    public void swim(){
        System.out.println("Duck swims well");
    }
}
public class MultipleInterfacesDemo {
    public static void main(String[] args) {
        Duck duck =new Duck();
        duck.fly();
        duck.swim();

        Flyable bird=new Duck();
        bird.fly();
        // bird.swim(); Error
        
        Swimmable fish=new Duck();
        fish.swim(); 
        // fish.fly();Error
    }
}
