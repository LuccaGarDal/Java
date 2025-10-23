package academy.devdojo.maratonajava.javacore.ZZFthreads.test;

public class DeadLockTest01 {
    static void main(String[] args) {
        Object lock1 = new Object();
        Object lock2 = new Object();

        Runnable r1 = () -> {
            synchronized (lock1) {
                System.out.println("Thread 1 segurando o lock 1");
                System.out.println("Thread 1 esperando o lock 2");
                synchronized (lock2) {
                    System.out.println("Thread 1 segurando o lock 2");
                }
            }
        };
        Runnable r2 = () -> {
            synchronized (lock2) {
                System.out.println("Thread 2 segurando o lock 2");
                System.out.println("Thread 2 esperando o lock 1");
                synchronized (lock1) {
                    System.out.println("Thread 2 segurando o lock 1");
                }
            }
        };

        new Thread(r1).start();
        new Thread(r2).start();

    }
}
