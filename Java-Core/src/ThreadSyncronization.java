
class Count {
    public int count = 0;

    // At a time only once thread can access it(Syncronized)
    public synchronized void increment() {
        ++count;
    }
}

public class ThreadSyncronization {
    public static void main(String[] args) throws Exception{

        Count c = new Count();

        Thread t1 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    c.increment();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    c.increment();
                }
            }
        });

        // Critical Section Probelm: both have a common resource 
        // Solution: make the methods accessed syncronized
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Count: " + c.count);

    }
}
