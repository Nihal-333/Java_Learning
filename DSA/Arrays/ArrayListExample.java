
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListExample{
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(12);
        list.add(18);
        list.add(19);
        list.add(20);
        list.add(21);
        list.add(22);
        list.add(14);
        list.add(1, 13);
        System.out.println("List values : "+ list);

        list.addFirst(11);
        list.addLast(15);
        System.out.println("List values after operation : "+ list);
        
        ArrayList<Integer>addList=new ArrayList<>(Arrays.asList(25,26,27,28,29));
        list.addAll(addList);
        System.out.println("List values after addAll operation : "+ list);
        System.out.println("Sub list values : "+ list.subList(1, 5));
        System.out.println();

        System.out.println("Get Method : "+list.get(2));
        System.out.println("Set Method : "+list.set(2, 50));
        System.out.println();

        System.out.println("Comtains Answer : "+list.contains(11));
        System.out.println("ComtainsAll Answer : "+list.containsAll(addList));
        System.out.println();

        System.out.println("List first value : "+ list.getFirst());
        System.out.println("List last value : "+ list.getLast());
        // System.out.println("Indexing : "+ list[2]); //Not allowed
        System.out.println();
        
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("List Sorted in descending order using Collections class: "+list);
        Collections.sort(list);
        System.out.println("List Sorted in ascending order using Collections class: "+list);
        System.out.println();
        
        list.sort((a,b)->b-a);
        System.out.println("List Sorted Using custom sort descending order: "+list);
        list.sort((a,b)->a-b);//Ascending order
        System.out.println("List Sorted Using custom sort ascending order: "+list);
        System.out.println();
        
        System.out.println("List isEmpty : "+ list.isEmpty());
        System.out.println("List Reversed : "+ list.reversed());
        System.out.println();
        
        System.out.print("List using forEach method : ");
        list.forEach(element->System.out.print(element+" "));
        System.out.println();
        
        list.replaceAll(n->n*2);
        System.out.println("List values after replaceAll operation : "+ list);
        System.out.println();

        list.removeFirst();
        System.out.println("List values removeFirst operation : "+ list);

        list.removeLast();
        System.out.println("List values removeLast operation : "+ list);

        list.removeIf(n->n>30);
        System.out.println("List values removeIf operation : "+ list);

        ArrayList<Integer>removeList=new ArrayList<>(Arrays.asList(26,28));
        list.removeAll(removeList);
        // list.removeAll(list);// Clears list use only if you want to remove specific list values from this list otherwise use clear
        System.out.println("List values removeAll operation : "+ list);


        list.remove(1);
        System.out.println("List values remove operation : "+ list);
        
        removeList.clear();
        System.out.println("List values after clear operation : "+ removeList);
        System.out.println();

        
    }
}