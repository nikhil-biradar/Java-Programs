package multithreading.methods;

public class Yield extends Thread {
    public static void main(String[] args) {

        Yield y1 = new Yield();
        Thread t1 = new Thread(y1, "FirstThread");

        Yield y2 = new Yield();
        Thread t2 = new Thread(y2, "SecondThread");

        t1.start();
        t2.start();
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread());
        Thread.yield();
        System.out.println(Thread.currentThread());
    }
}