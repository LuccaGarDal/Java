package academy.devdojo.maratonajava.exercicios.ExercicioStreams;

import java.util.Random;
import java.util.stream.Stream;

public class Generate02 {
    static void main(String[] args) {

        Stream.generate(() -> new Random().nextInt(0, 100))
                .limit(10)
                .forEach(System.out::println);
    }
}
