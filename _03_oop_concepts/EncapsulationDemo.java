package _03_oop_concepts;

class Student{
    private String name;
    private int age;

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name=name;
    }

    public int  getAge(){
        return this.age;
    }

    public void setAge(int age){
        if(age>0) this.age=age;
    }

}

public class EncapsulationDemo {
    public static void main(String[] args) {
        Student s=new Student();
        s.setName("Luffy");
        s.setAge(21);

        String name=s.getName();
        int age=s.getAge();

        System.out.println("name of student : "+ name);
        System.out.println("age of student : "+ age);
    }
}
