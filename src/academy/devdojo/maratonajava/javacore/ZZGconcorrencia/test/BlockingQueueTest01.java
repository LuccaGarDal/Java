package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class BlockingQueueTest01 {
    static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> list = new ArrayBlockingQueue<>(1);

        list.put("Lucca");
        System.out.printf("%s added the value %s%n", Thread.currentThread().getName(), list.peek());
        System.out.printf("Trying to add an another value%n");
        new Thread(new RemoveFromQueue(list)).start();
        list.put("Jous");
        System.out.printf("%s added the value %s%n", Thread.currentThread().getName(), list.peek());
    }

    static class RemoveFromQueue implements Runnable {
        private final BlockingQueue<String> bq;

        RemoveFromQueue(BlockingQueue<String> bq) {
            this.bq = bq;
        }

        @Override
        public void run() {
            System.out.printf("%s going to sleep for 2s %n", Thread.currentThread().getName());
            try {
                TimeUnit.SECONDS.sleep(2);
                System.out.printf("%s removing the value %s%n", Thread.currentThread().getName(), bq.take());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
