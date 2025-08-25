package _02_classes_objects_static;

class StaticBlock{
    static int value;
    static{
        //Runs only when class is called with static methods(Only with display not with show method)
        value=44;
        System.out.println("Static block executed!");
    }

    static void display(){
        System.out.println("Static value: " + value);
    }

    void show(){
        System.out.println("Show value: " + value);
    }
}
public class StaticBlockExample {
    public static void main(String[] args) {
        StaticBlock.display();
        StaticBlock.display();
        StaticBlock s=new StaticBlock();
        s.show();
    }
}
