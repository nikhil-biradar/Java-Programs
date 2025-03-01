package multithreading.object_creation_ways;

public class ByRunnableInterface implements Runnable {
    public static void main(String[] args) {
        System.out.println("Main Thread is Running");
        System.out.println(Thread.currentThread());

        ByRunnableInterface obj = new ByRunnableInterface();

        Thread t = new Thread(obj, "Nikhil");

        t.start();
    }

    @Override
    public void run() {
        System.out.println("New Thread is Running");
        System.out.println(Thread.currentThread());

        for(int i = 1; i<= 5; i++){
            System.out.println(i);
        }
    }
}