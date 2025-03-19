package multithreading.methods;

public class Join extends Thread {

    @Override
    public void run() {
        System.out.println("Child Thread is Running");

        for(int i=1; i<=4; i++){
            System.out.println(Thread.currentThread() + " : " +  i);
        }

        System.out.println("Child Thread is Ending");
    }

    public static void main(String[] args) throws InterruptedException {

        Join j1 = new Join();
        Thread t1 = new Thread(j1, "ChildThread");
        t1.start();
        t1.join();
        System.out.println("Main Thread is Ending");
    }
}
