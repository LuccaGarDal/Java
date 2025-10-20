package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Category;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Promotion;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

public class StreamTest16 {
    static void main(String[] args) {
        long num = 10_000_000;
        sumFor(num);
        sumStreamIterate(num);
        sumStreamIterateParallel(num);
        sumLongStreamIterate(num);
        sumLongStreamIterateParallel(num);
    }

    private static void sumFor(long num) {
        System.out.println("SumFor");
        long result = 0;
        long init = System.currentTimeMillis();
        for (int i = 0; i < num; i++) {
            result += i;
        }
        long end = System.currentTimeMillis();
        System.out.println(end - init + "ms");
    }

    private static void sumStreamIterate(long num) {
        System.out.println("Stream Iterate");
        long init = System.currentTimeMillis();
        long result = Stream.iterate(1L, l -> l + 1).limit(num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(end - init + "ms");
    }

    private static void sumStreamIterateParallel(long num) {
        System.out.println("Stream Iterate Parallel");
        long init = System.currentTimeMillis();
        long result = Stream.iterate(1L, l -> l + 1).limit(num).parallel().reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(end - init + "ms");
    }

    private static void sumLongStreamIterate(long num) {
        System.out.println("Long Stream Iterate");
        long init = System.currentTimeMillis();
        long result = LongStream.rangeClosed(1L, num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(end - init + "ms");
    }

    private static void sumLongStreamIterateParallel(long num) {
        System.out.println("Long Stream Iterate Parallel");
        long init = System.currentTimeMillis();
        long result = LongStream.rangeClosed(1L, num).parallel().reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(end - init + "ms");
    }


}
