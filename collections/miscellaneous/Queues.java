package collections.miscellaneous;
import java.util.Queue;
import java.util.LinkedList;

public class Queues {
    public static void main(String[] args) {

        Queue <Integer> list = new LinkedList<>();
        list.offer(10); // Add Elements to queue
        list.offer(20);
        list.offer(30);
        list.offer(40);
        System.out.println(list + "\n");

        list.poll();
        System.out.println(list + "\n"); // Remove elements from queue

        System.out.println(list.peek()); // Which element to remove next
    }
}