package academy.devdojo.maratonajava.exercicios.ExercicioStreams;

import java.util.List;
import java.util.stream.Collectors;

public class Filter01 {
    static void main(String[] args) {
        List<String> nomes = List.of("Amaral", "Lucca", "Josué", "Iann", "Enrico");

        List<String> list = nomes.stream()
                .filter(s -> s.startsWith("A"))
                .toList();

        System.out.println(list);

        List<String> list1 = nomes.stream()
                .map(String::toUpperCase)
                .toList();

        System.out.println(list1);

        List<String> list2 = nomes.stream()
                .filter(s -> s.startsWith("A"))
                .map(String::toUpperCase)
                .toList();

        System.out.println(list2);
    }
}
