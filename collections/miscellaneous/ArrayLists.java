package collections.miscellaneous;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ArrayLists {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Nitin"); //Added elements to list
        list.add("Sonali");
        list.add("Ashish");
        System.out.println(list + "\n");

        list.add(1, "Nikhil"); // Added Nikhil at index 1
        System.out.println(list + "\n");

        list.remove(2); //Remove index 2 elements from list
        System.out.println(list + "\n");

        list.set(1, "Akshay"); // Replace index 1 (Nitin) element by Akshay
        System.out.println(list + "\n");

        String s = list.get(2); // Print element on index 2
        System.out.println(s + "\n");

        System.out.println(list.contains("Nitin") + "\n"); // Checks whether it is present or not

//        list.clear(); // Clear all the elements from list
//        System.out.println(list);

//        for(int i=0; i<list.size(); i++){
//            System.out.println(list.get(i));
//        }

//        for (String str : list){ // For each loop
//            System.out.println(str);
//        }

        Vector<String> vector = new Vector<>();
        vector.addAll(list); // Prints all elements from list
        System.out.println(vector);
    }
}