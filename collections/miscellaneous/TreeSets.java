package collections.miscellaneous;
import java.util.Set;
import java.util.TreeSet;

public class TreeSets {
    public static void main(String[] args) {
        //It prints in Sorted Order

        Set<Integer> set = new TreeSet<>();
        set.add(50);
        set.add(20);
        set.add(30);
        set.add(15);
        set.add(60);
        set.add(3);
        System.out.println(set + "\n");

        set.remove(30);
        System.out.println(set + "\n");

        System.out.println(set.contains(20) + "\n");

        System.out.println(set.isEmpty() + "\n");

        System.out.println(set.size() + "\n");

        set.clear();
        System.out.println(set + "\n");

        //String
        Set<String> s = new TreeSet<>();
        s.add("Nikhil");
        s.add("Ashish");
        s.add("Pavan");
        s.add("Asha");
        s.add("Zoya");
        s.add("Champ");
        System.out.println(s + "\n");

        for(String str : s){
            System.out.println(str);
        }
    }
}
