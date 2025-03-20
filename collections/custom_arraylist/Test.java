package collections.custom_arraylist;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println(list.size());
    }
}