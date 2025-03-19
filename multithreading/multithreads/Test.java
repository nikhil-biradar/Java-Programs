package multithreading.multithreads;

public class Test extends Thread {
    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();

        Test thread1 = new Test();
        thread1.setName("Ramesh");

        Test thread2 =  new Test();
        thread2.setName("Suresh");

        Test thread3 =  new Test();
        thread3.setName("Kamlesh");

        thread1.start();
        thread2.start();
        thread3.start();

    }

    @Override
    public void run() {
        synchronized (this) {
            for(int i = 0; i < 5; i++){
                System.out.println(Thread.currentThread().getName() + " and index is "+i);
            }
        }
    }
}


