package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

public class StreamTest10 {
    static void main(String[] args) {
        Stream.iterate(1, n -> n + 2)
                .limit(10)
                .forEach(System.out::println);

        Stream.iterate(new int[]{0, 1}, n -> new int[]{n[1], n[0] + n[1]})
                .limit(10)
                .forEach(ints -> System.out.println(Arrays.toString(ints)));

        Stream.iterate(new int[]{0, 1}, n -> new int[]{n[1], n[0] + n[1]})
                .map(a -> a[0])
                .limit(10)
                .forEach(System.out::println);

        ThreadLocalRandom localRandom = ThreadLocalRandom.current();

        Stream.generate(() -> localRandom.nextInt(1, 500))
                .limit(90)
                .forEach(System.out::println);
    }
}
