package multithreading.methods;

public class SetPriority implements Runnable{
    public static void main(String[] args) {
        SetPriority obj = new SetPriority();
        Thread t1 = new Thread(obj, "t1");
        Thread t2 = new Thread(obj, "t2");
        Thread t3 = new Thread(obj, "t3");

        t1.setPriority(2);
        t2.setPriority(4);
        t3.setPriority(9);

        t1.start();
        t2.start();
        t3.start();
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
