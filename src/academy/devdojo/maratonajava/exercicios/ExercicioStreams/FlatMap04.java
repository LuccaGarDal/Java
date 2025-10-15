package academy.devdojo.maratonajava.exercicios.ExercicioStreams;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap04 {
    private static List<List<String>> listaDeListas = List.of(
            List.of("A", "B", "C"),
            List.of("D", "E"),
            List.of("F", "G", "H", "I")
    );

    static void main(String[] args) {

        listaDeListas.stream()
                .flatMap(Collection::stream)
                .forEach(System.out::println);

        long count = listaDeListas.stream()
                .flatMap(Collection::stream)
                .count();
        System.out.println(count);

        List<String> listaConcatenada = listaDeListas.stream()
                .flatMap(List::stream)
                .toList();

        System.out.println(listaConcatenada);

        listaDeListas.stream()
                .flatMap(Collection::stream)
                .reduce(String::concat)
                .ifPresent(System.out::println);

    }
}
