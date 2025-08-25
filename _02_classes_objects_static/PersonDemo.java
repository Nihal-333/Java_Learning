package _02_classes_objects_static;

class Person{
    String name;
    int age;

    void sayHello(){
        System.out.println("Hello, my name is "+name+" & my age is "+age);
    }
}

public class PersonDemo {
    public static void main(String[] args1){
        Person p1=new Person();
        p1.name="Luffy";
        p1.age=21;
        p1.sayHello();
        
        Person p2=new Person();
        p2.name="Zoro";
        p2.age=23;
        p2.sayHello();
    }
}
