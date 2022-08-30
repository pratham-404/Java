
// Thread => Unit of a Process

// methods to use multithreding in a class
// 1. extends Thread
// 2. implements Runnable

// start() is used to create a new thread
// run() is used to start executing that thread.

// class Hi extends Thread { // inheriting Thread class
class Hi implements Runnable { // implementing Runnable interface
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hi");

            try {
                // To delay output by some seconds
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

// class Hello extends Thread { // inheriting Thread class
class Hello implements Runnable { // implementing Runnable interface
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");

            try {
                // To delay output by some seconds
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

public class MultiThreading {
    public static void main(String[] args) throws Exception{
        Hi obj1 = new Hi();
        Hello obj2 = new Hello();

        // To run both the methods parallel we use Multi-Threading

        // class: Thread
        // obj1.start();

        // inteface: Runnable
        Thread t1 = new Thread(obj1);
        t1.start();
        Thread.sleep(10); // delay

        // class: Thread
        // obj2.start();

        // inteface: Runnable
        Thread t2 = new Thread(obj2);
        t2.start();
        Thread.sleep(10); // delay

        // creating thread using labmda expressions
        Thread t3 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hola");
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        });
        t3.start();

        System.out.println(t1.isAlive());// to check whether a thread is alive we use isAlive()
        
        // To Execute something after threads t1, t2 & t3 are completed execution we use join()
        t1.join();
        t2.join();
        t3.join();
        System.out.println("Bye Bye");

        System.out.println(t1.isAlive());// to check whether a thread is alive 

    }
}
