package academy.devdojo.maratonajava.exercicios.ExercicioStreams;

import java.util.Comparator;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class Generate01 {
    static void main(String[] args) {


       Stream.generate(() -> (int) (Math.random() * 100))
               .limit(5)
               .forEach(System.out::println);

       Stream.generate(() -> "O java é top")
               .limit(10)
               .forEach(System.out::println);

       Stream.generate(UUID::randomUUID)
               .limit(5)
               .forEach(System.out::println);

        ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();
       Stream.generate(() -> threadLocalRandom.nextInt(1, 100))
               .limit(10)
               .reduce(Integer::max)
               .ifPresent(System.out::println);


        AtomicInteger contador = new AtomicInteger(1);
       Stream.generate(() -> "Pessoa " + contador.getAndIncrement())
               .limit(10)
               .forEach(System.out::println);

    }
}
