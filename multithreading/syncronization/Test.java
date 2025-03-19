package multithreading.syncronization;

public class Test extends Thread {
    static final Object lock = new Object();

    public static void main(String[] args) throws InterruptedException {

        Test thread1 = new Test();
        thread1.setName("Ramesh");

        Test thread2 =  new Test();
        thread2.setName("Suresh");

        Test thread3 =  new Test();
        thread3.setName("Nilesh");

        thread1.start();
        Thread.sleep(100);
        thread2.start();
        Thread.sleep(100);
        thread3.start();
        Thread.sleep(100);
    }

    @Override
    public void run() {
        synchronized (lock) {
            for(int i = 0; i <= 5; i++){
                System.out.println(Thread.currentThread().getName() + " and index is "+i);
            }
        }
    }
}
