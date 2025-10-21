package academy.devdojo.maratonajava.exercicios.ExercicioStreams;

import java.util.List;
import java.util.stream.Stream;

public class Iterate02 {
    static void main(String[] args) {

        Stream.iterate(1, s -> s + 1)
                .limit(50)
                .filter(s -> s % 5 == 0)
                .forEach(System.out::println);



    }
}
