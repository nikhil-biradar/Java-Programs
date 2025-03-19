package multithreading.methods;

public class ActiveCount extends Thread{
    @Override
    public void run() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(Thread.currentThread());
    }

    public static void main(String[] args) throws InterruptedException {
        ActiveCount obj = new ActiveCount();

        Thread t1 = new Thread(obj, "Thread1");
        Thread t2 = new Thread(obj, "Thread2");

        t1.start();
        t1.setPriority(1);
        t2.start();
        t2.setPriority(10);

        Thread.sleep(150);

        System.out.println(Thread.currentThread());
        System.out.println(Thread.activeCount());
    }
}