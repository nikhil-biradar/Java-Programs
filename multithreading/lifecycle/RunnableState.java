package multithreading.lifecycle;

public class RunnableState extends Thread {
    public static void main(String[] args) {
        RunnableState obj = new RunnableState();
        Thread t = new Thread(obj);

        System.out.println(obj.getState());

        obj.start();
        System.out.println(t.getState());

    }

    @Override
    public void run() {

    }
}
