package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TimeUnit;

public class LinkedTransferQueueTest01 {
    static void main(String[] args) throws InterruptedException {
        LinkedTransferQueue<String> tq = new LinkedTransferQueue<>();
        System.out.println(tq.add("Lucca"));
        System.out.println(tq.offer("Lucca"));
        System.out.println(tq.offer("Lucca", 2,  TimeUnit.SECONDS));
        tq.put("DevDojo");
        if (tq.hasWaitingConsumer()) {
            tq.transfer("DevDojo");
        }
        System.out.println(tq.tryTransfer("Academy"));
        System.out.println(tq.tryTransfer("Academy", 5, TimeUnit.SECONDS));
        System.out.println(tq.element());
        System.out.println(tq.peek());
        System.out.println(tq.poll());
        System.out.println(tq.remove());
        System.out.println(tq.remainingCapacity());

    }
}
