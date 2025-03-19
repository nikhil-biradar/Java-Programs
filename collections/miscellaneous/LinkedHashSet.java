package collections.miscellaneous;
import java.util.Set;

public class LinkedHashSet {
    public static void main(String[] args) {

        Set<Integer> set = new java.util.LinkedHashSet<>();
        //It maintains Order of Elements

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        set.add(30);
        System.out.println(set);

        set.remove(30);
        System.out.println(set);

        System.out.println(set.contains(20));

        System.out.println(set.isEmpty());

        System.out.println(set.size());

        set.clear();
        System.out.println(set);
    }
}
