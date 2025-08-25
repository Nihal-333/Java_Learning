package _02_classes_objects_static;

class Counter{
    static int counter=0;// shared among all instances Accessible to class & objects
    int counter1=0;// shared among all instances Accessible to  class objects only
    Counter(){
        counter++;
        System.out.println("Initial Counter value : "+ counter);
    }

    void display(){
        System.out.println("counter value : "+ counter);
    }
}
public class StaticDemo {
    public static void main(String[] args) {
        Counter c1=new Counter();
        Counter c2=new Counter();
        Counter c3=new Counter();
        c1.display();
        c2.display();
        c3.display();
        System.out.println("Static Counter value : "+Counter.counter);
        System.out.println("Counter1 value : "+c1.counter1);
    }
}
