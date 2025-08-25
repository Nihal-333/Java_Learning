package _05_exception_handling;

public class MultipleCatchDemo {
    public static void main(String[] args) {
        try{
            String str=null;
            System.out.println("String length : "+str.length());

        }catch(ArithmeticException a){
            System.out.println("Error : Arithmetic exception occured! : "+ a);
        }catch(NullPointerException n){
            System.out.println("Error : Nullpointer exception occured! : "+ n);
        }catch(Exception e){
            System.out.println("General exception : "+ e);
        }
    }
}
