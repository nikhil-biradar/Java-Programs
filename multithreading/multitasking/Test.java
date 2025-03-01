package multithreading.multitasking;

public class Test implements Runnable {

    int a = 20;
    int b = 10;

    @Override
    public void run() {
        addition();
        subtraction();
        multiplication();
    }

    public void addition(){
        int add = a + b;
        System.out.println(add);
    }
    public void subtraction (){
        int sub = a - b;
        System.out.println(sub);
    }

    public void multiplication(){
        int mul = a * b;
        System.out.println(mul);
    }

    public static void main(String[] args) {

        Test obj = new Test();
        Thread t = new Thread(obj);

        t.start();
    }
}