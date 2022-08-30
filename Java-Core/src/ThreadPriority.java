
class One implements Runnable {
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("One " + Thread.currentThread().getPriority());
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class Two implements Runnable {
    public void run() {

        // Thread.currentThread().getName();
        // Thread.currentThread().getPriority();

        for (int i = 0; i < 3; i++) {
            System.out.println("Two " + Thread.currentThread().getPriority());
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

public class ThreadPriority {
    public static void main(String[] args) throws Exception{
        One obj1 = new One();
        Two obj2 = new Two();

        Thread t1 = new Thread(obj1, "T1"); // Naming Threads
        Thread t2 = new Thread(obj2, "T2");

        // t1.setName("T1");
        // t2.setName("T2");

        // Default naming of threads is 0-indexed i.e Thread-0, Thread-1, ... , etc.
        System.out.println("Thread t1: " + t1.getName());
        System.out.println("Thread t2: " + t2.getName());

        // Thread Priority: MIN_PRIORITY(1) --- NORM_PRIORITY(5) --- MAX_PRIORITY(10)
        t1.setPriority(4);
        // t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        System.out.println("Thread Priority t1: " + t1.getPriority());
        System.out.println("Thread Priority t2: " + t2.getPriority());

        t1.start();
        Thread.sleep(10);
        t2.start();
    }
}
