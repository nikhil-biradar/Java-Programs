package multithreading.producer_consumer;

public class Consumer extends Thread {
    Company c;

    Consumer(Company c){
        this.c = c;
    }

    @Override
    public void run() {
        int i = 1;
        while(i < 10){
            try {
                this.c.consume_item();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            i++;
        }
    }
}