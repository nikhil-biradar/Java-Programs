package multithreading.object_creation_ways;

public class ByThreadClass extends Thread {

    public void run(){
        System.out.println("New Thread Running");
        System.out.println(Thread.currentThread());
    }

    public static void main(String[] args) {

        System.out.println("Main Thread Running");
        System.out.println(Thread.currentThread());

        ByThreadClass obj = new ByThreadClass();

        Thread t = new Thread(obj);

        t.start();
    }
}