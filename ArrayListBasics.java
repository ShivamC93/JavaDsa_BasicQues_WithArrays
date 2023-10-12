import java.util.ArrayList;

public class ArrayListBasics {
    public static void main(String[] args) {
        // Wrapper classes
        // Integer i = Integer.valueOf(4);
        // Float f = Float.valueOf(6);
        // System.out.println(i);

        ArrayList<Integer> l1 = new ArrayList<>();

        //add new element
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);
        System.out.println(l1);

        //get an element at ondex i
        System.out.println(l1.get(1));

        //Print with for loop
        for(int i =0; i<l1.size(); i++){
            System.out.println(l1.get(i));
        }        

        //printing the array list directly
        System.out.println(l1);

        //adding element at some index i
        l1.add(1,100);
        System.out.println(l1);

        //modifying element at index i
        l1.set(1,10);
        System.out.println(l1);
        
        //remove at index
        l1.remove(1);

        //removing an element e
        l1.remove(Integer.valueOf(7));
        System.out.println(l1);

        //checking if an element exists
        boolean ans = l1.contains(Integer.valueOf(60));
        System.out.println(ans);

        //if you dont specify class you can put anything inside.
        ArrayList l = new ArrayList();
        l.add("pqres");
        l.add(1);
        l.add(true);
        System.out.println(l);

    }
}
