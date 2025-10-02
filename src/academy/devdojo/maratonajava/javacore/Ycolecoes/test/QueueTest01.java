package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest01 {
    static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        queue.add("A");
        queue.add("C");
        queue.add("D");
        queue.add("B");

        for (String s : queue) {
            System.out.println(s);
        }

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

    }
}
