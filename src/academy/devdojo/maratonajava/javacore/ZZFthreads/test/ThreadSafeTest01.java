package academy.devdojo.maratonajava.javacore.ZZFthreads.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ThreadSafeNames {
    private List<String> names = new ArrayList<>();

    public synchronized void add (String name) {
        names.add(name);
    }

    public synchronized void removeFirst () {
        if (!names.isEmpty()) {
            System.out.println(Thread.currentThread().getName());
            System.out.println(names.removeFirst());
        }
    }
}

public class ThreadSafeTest01 {
    static void main(String[] args) {

        ThreadSafeNames threadSafeNames = new ThreadSafeNames();
        threadSafeNames.add("Morgan");
        Runnable r = threadSafeNames::removeFirst;
        new Thread(r).start();
        new Thread(r).start();
    }
}
