package academy.devdojo.maratonajava.exercicios.ExercicioStreams;

import java.util.Collection;
import java.util.List;

public class TudoJunto01 {
    public static List<List<Integer>> matriz = List.of(
            List.of(1, 2, 3),
            List.of(4, 5, 6),
            List.of(7, 8, 9)
    );

    static void main(String[] args) {

        matriz.stream()
                .flatMap(Collection::stream)
                .forEach(System.out::println);

        matriz.stream()
                .flatMap(Collection::stream)
                .reduce(Integer::sum)
                .ifPresent(System.out::println);

        boolean todosSaoMenorQue10 = matriz.stream()
                .flatMap(Collection::stream)
                .allMatch(s -> s < 10);

        System.out.println(todosSaoMenorQue10);

        matriz.stream()
                .flatMap(Collection::stream)
                .filter(s -> s > 4)
                .findFirst()
                .ifPresent(System.out::println);

        matriz.stream()
                .flatMap(Collection::stream)
                .filter(s -> s % 2 != 0)
                .reduce((i1, i2) -> i1 * i2)
                .ifPresent(System.out::println);

    }
}
