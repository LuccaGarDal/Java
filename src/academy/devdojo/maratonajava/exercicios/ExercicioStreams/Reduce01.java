package academy.devdojo.maratonajava.exercicios.ExercicioStreams;

import java.util.List;

public class Reduce01 {
    private static List<Integer> numeros = List.of(2,4,6,8,10);

    static void main(String[] args) {
        numeros.stream()
                .reduce(Integer::sum)
                .ifPresent(System.out::println);

        numeros.stream()
                .reduce((integer, integer2) -> integer * integer2)
                .ifPresent(System.out::println);

        numeros.stream()
                .reduce(Integer::max)
                .ifPresent(System.out::println);

        numeros.stream()
                .reduce(Integer::min)
                .ifPresent(System.out::println);

        numeros.stream()
                .map(s -> s.toString())
                .reduce(String::concat)
                .ifPresent(System.out::println);
    }
}
