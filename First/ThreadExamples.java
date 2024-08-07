package First;

public class ThreadExamples {

    static class MyThread extends Thread {
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println(getName() + " - Count: " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class MyRunnable implements Runnable {
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + " - Count: " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class SynchronizedCounter {
        private int count = 0;

        public synchronized void increment() {
            count++;
            System.out.println(Thread.currentThread().getName() + " Count: " + count);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        public int getCount() {
            return count;
        }
    }

    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();
        thread1.start();
        thread2.start();

        Thread thread3 = new Thread(new MyRunnable());
        Thread thread4 = new Thread(new MyRunnable());
        thread3.start();
        thread4.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        SynchronizedCounter counter = new SynchronizedCounter();
        Runnable counterTask = () -> {
            for (int i = 0; i < 5; i++) {
                counter.increment();
            }
        };

        Thread thread5 = new Thread(counterTask);
        Thread thread6 = new Thread(counterTask);
        thread5.start();
        thread6.start();

        try {
            thread5.join();
            thread6.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final count: " + counter.getCount());
    }
}
