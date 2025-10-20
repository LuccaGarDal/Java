package academy.devdojo.maratonajava.javacore.ZZFthreads.test;

class ThreadExample extends Thread {
    public char a;

    public ThreadExample(char a) {
        this.a = a;

    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 100; i++) {
            System.out.print(a);
            if (i % 100 == 0) {
                System.out.println();
            }
        }
    }
}

class ThreadExampleRunnable implements Runnable {
    public char a;

    public ThreadExampleRunnable(char a) {
        this.a = a;

    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 100; i++) {
            System.out.print(a);
            if (i % 100 == 0) {
                System.out.println();
            }
        }
    }
}

public class ThreadTest01 {
    static void main(String[] args) {
        Thread t1 = new Thread(new ThreadExampleRunnable('a'));
        Thread t2 = new Thread(new ThreadExampleRunnable('b'));
        Thread t3 = new Thread(new ThreadExampleRunnable('c'));
        Thread t4 = new Thread(new ThreadExampleRunnable('d'));

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
