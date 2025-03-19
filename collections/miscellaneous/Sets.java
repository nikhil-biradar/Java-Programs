package collections.miscellaneous;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        //It does not maintain any Order

        set.add(20);
        set.add(10);
        set.add(40);
        set.add(30);
        set.add(50);
        set.add(30);
        System.out.println(set + "\n"   );

        set.remove(30);
        System.out.println(set + "\n");

        System.out.println(set.contains(20) + "\n");

        System.out.println(set.isEmpty() + "\n");

        System.out.println(set.size() + "\n");

//        set.clear();
//        System.out.println(set);

        TreeSet<Integer> tset = new TreeSet<>();
        tset.addAll(set);
        System.out.println(tset + "\n");




    }
}
