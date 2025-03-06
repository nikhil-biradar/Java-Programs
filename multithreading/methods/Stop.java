package multithreading.methods;

public class Stop extends Thread {
    public static void main(String[] args) {

        Sleep thread1 = new Sleep();
        Thread t1 = new Thread(thread1);
        t1.start();
        System.out.println("Thread1 in Running State");
        t1.stop();
    }

    @Override
    public void run() {
        System.out.println("Thread1 started its execution");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Thread2 started its execution");
    }
}
