package multithreading.daemon;

public class Daemon implements Runnable {

    @Override
    public void run() {
        if(Thread.currentThread().isDaemon()){
            for(int i = 1; i <= 10; i++)
            System.out.println(Thread.currentThread().getName() + " is Daemon Thread " + i);
        }else{
            for(int i = 1; i <= 10; i++)
            System.out.println(Thread.currentThread().getName() + " is User Thread " + i);
        }
    }

    public static void main(String[] args) {
        Daemon obj = new Daemon();

        Thread t1 = new Thread(obj, "Thread1");
        Thread t2 = new Thread(obj, "Thread2");
        Thread t3 = new Thread(obj, "Thread3");
        Thread t4 = new Thread(obj, "Thread4");

        t1.setDaemon(true);
        t2.setDaemon(true);
        t4.setDaemon(true);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        System.out.println("Main Thread");
    }
}