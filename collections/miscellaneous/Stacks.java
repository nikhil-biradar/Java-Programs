package collections.miscellaneous;
import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {

        Stack<String> list = new Stack<>(); //LIFO
        list.push("Nikhil");
        list.push("Nitin");
        list.push("Sonali");
        System.out.println(list + "\n");

        System.out.println(list.peek() + "\n"); // It gives top element

        list.pop(); // Removed the last element first
        System.out.println(list);
    }
}
