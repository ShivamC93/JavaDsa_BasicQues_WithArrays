import java.util.ArrayList;
import java.util.Collections;

public class reverselinkedlist {
    static void reverseList(ArrayList<Integer> list){
        int i = 0, j = list.size() - 1;

        while(i<j){
            /*
             int temp = a;
             a = b;
             b= temp;   same logic
             */



            Integer temp = Integer.valueOf(list.get(i));
            list.set(i, list.get(j));
            list.set(j, temp);    
            
            i++;
            j--;            
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<>();
        List.add(0);
        List.add(10);
        List.add(3);
        List.add(5);
        List.add(22);
        List.add(10);

        System.out.println("Original list"+ List);
        reverseList(List);
        System.out.println("Reversed list" + List);
        //we can use inbuilt functions in collection class for various task in arraylist 
        Collections.sort(List);
        System.out.println("Ascending order" + List); 
        
        Collections.sort(List, Collections.reverseOrder());
        System.out.println("Descending order" + List);
    }
}





