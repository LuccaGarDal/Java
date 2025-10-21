package academy.devdojo.maratonajava.javacore.ZZFthreads.test;


class ThreadExampleRunnable2 implements Runnable {
    public char a;

    public ThreadExampleRunnable2(char a) {
        this.a = a;

    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 250; i++) {
            System.out.print(a);
            if (i % 100 == 0) {
                System.out.println();
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class ThreadTest02 {
    static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new ThreadExampleRunnable2('J'));
        Thread t2 = new Thread(new ThreadExampleRunnable2('A'));
        t1.start();
        t1.join();
        t2.start();

    }
}
