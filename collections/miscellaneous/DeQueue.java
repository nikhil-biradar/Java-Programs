package collections.miscellaneous;
import java.util.ArrayDeque;

public class DeQueue {
    public static void main(String[] args) {

        ArrayDeque<String> list = new ArrayDeque<>();  //FIFO
        list.add("Nikhil");
        list.add("Nitin");
        list.add("Sonali");
        System.out.println(list);

        list.remove();
        System.out.println(list);

        System.out.println(list.contains("Sonali"));

        System.out.println(list.size());


    }
}
