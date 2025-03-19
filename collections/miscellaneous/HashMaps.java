package collections.miscellaneous;

import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();
        map.put("Java", 4000);
        map.put("Python", 3500);
        map.put("Spring", 5000);
        map.put("Hibernate", 6000);
        System.out.println(map);

        System.out.println(map.size());
        System.out.println(map.get("Spring"));
        map.remove("Java");
        System.out.println(map);
        System.out.println(map.isEmpty());
        System.out.println(map.containsValue(6000));
        System.out.println(map.containsKey("C++"));
    }
}
