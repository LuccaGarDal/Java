package academy.devdojo.maratonajava.exercicios.ExercicioStreams;

import java.util.stream.Stream;

public class Iterate01 {
    static void main(String[] args) {
        Stream.iterate(0, s -> s + 2)
                .limit(10)
                .forEach(s -> System.out.print(s + " "));

        System.out.println();
        System.out.println("------------");

        Stream.iterate(5, s -> s + 5)
                .limit(10)
                .forEach(s -> System.out.print(s + " "));

        System.out.println();

        Stream.iterate(new int[] {1,1}, s -> new int[] {s[1], s[0] + s[1]})
                .limit(10)
                .forEach(s -> System.out.println(s[0]));

    }
}
