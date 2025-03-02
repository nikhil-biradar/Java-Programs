package multithreading.lifecycle;

public class NewState extends Thread {
    public static void main(String[] args) {

        NewState obj = new NewState();
        Thread t = new Thread(obj);

        System.out.println(obj.getState());

        t.start

    }

    @Override
    public void run() {

    }
}
