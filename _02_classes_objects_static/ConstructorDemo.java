package _02_classes_objects_static;


class Anime{
    String name;
    int episodes;

    Anime(){
        this.name="Haikyu";
        this.episodes=80;
    }

    Anime(String Name, int Episodes){
        this.name=Name;
        this.episodes=Episodes;
    }

    void display(){
        System.out.println("Anime : "+ name);
        System.out.println("Episodes : "+ episodes+"\n");
    }
}
public class ConstructorDemo {
    public static void main(String[] args){
        Anime a1=new Anime("One Piece", 1130);
        Anime a2=new Anime("Naruto", 720);
        a1.display();
        a2.display();
        Anime a3= new Anime();
        a3.display();
    }
}
