package multithreading.deadlock;

public class Example
{
    public static void main(String[] args)
    {
        final String r1 = "edureka";
        final String r2 = "java";

        Thread t1 = new Thread()
        {
            public void run()
            {
                synchronized(r1)
                {
                    System.out.println("Thread 1: Locked r1");
                    /*try
                    { Thread.sleep(1000);
                    } catch(InterruptedException e) {
                        e.printStackTrace();
                    }*/
                    synchronized(r2)
                    {
                        System.out.println("Thread 1: Locked r2");
                    }
                }
            }
        };
        Thread t2 = new Thread()
        {
            public void run()
            {
                synchronized(r1)
                {
                    System.out.println("Thread 2: Locked r1");
                    /*try{ Thread.sleep(1000);
                    } catch(InterruptedException e) {
                        e.printStackTrace();
                    }*/
                    synchronized(r2)
                    {
                        System.out.println("Thread 2: Locked r2");
                    }
                }
            }
        };

        t1.start();
        t2.start();
    }
}