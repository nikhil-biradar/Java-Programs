package collections.miscellaneous;

import java.util.LinkedList;

public class LinkedLists {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("Nikhil"); // Add Elements to the list
        list.add("Nitin");
        list.add("Ashish");
        System.out.println(list + "\n");

        for(String str : list){ // prints Elements without bracket
            System.out.println(str);
        }

        list.addFirst("Akshay"); // Add Element at First
        list.addLast("Mahesh"); // Add Element at Last
        System.out.println("\n" + list + "\n");

        list.add(3, "Sonali");
        System.out.println(list + "\n"); // Add Sonali at index 3

        list.removeFirst();
        list.remove(2);
        list.removeLast();
        System.out.println(list);
    }
}
