package Lesson11;

class Counter {
    private int count = 0;
    // synchronized method to ensure only one thread updates count at a time
    public synchronized void increment() {
        count++;
    }
    public int getCount() {
        return count;
    }
}

class MyThread extends Thread {
    private Counter counter;
    public MyThread(Counter counter) {
        this.counter = counter;
    }
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}

public class SynchronizedMethodDemo {
    public static void main(String[] args) {
        Counter counter = new Counter();

        MyThread t1 = new MyThread(counter);
        MyThread t2 = new MyThread(counter);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Final count: " + counter.getCount());
    }
}

