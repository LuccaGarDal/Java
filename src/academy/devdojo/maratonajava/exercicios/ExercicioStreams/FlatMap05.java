package academy.devdojo.maratonajava.exercicios.ExercicioStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class FlatMap05 {
    static void main(String[] args) {
        List<List<Integer>> listaDeNumeros = List.of(
                List.of(1, 2, 3),
                List.of(4, 5),
                List.of(6, 7, 8)
        );

        List<Integer> list = listaDeNumeros.stream()
                .flatMap(Collection::stream)
                .filter(s -> s % 2 == 0)
                .toList();

        System.out.println(list);

    }
}
