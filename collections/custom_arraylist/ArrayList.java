package collections.custom_arraylist;

public class ArrayList {
    public static void main(String[] args) {
        CustomArrayList <Integer> list = new CustomArrayList<>();

        list.add(2);
        list.add("Nikhil");
        list.add(20.2f);
        list.add(20L);
        list.add(true);

        list.display();
    }
}