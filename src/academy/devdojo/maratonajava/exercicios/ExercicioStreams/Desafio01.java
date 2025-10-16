package academy.devdojo.maratonajava.exercicios.ExercicioStreams;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Desafio01 {
    public static List<String> frase = List.of(
            "o java é divertido",
            "streams são poderosas",
            "lambda simplifica o código"
    );

    static void main(String[] args) {

        long count = frase.stream()
                .map(i -> i.split(" "))
                .flatMap(Arrays::stream)
                .count();

        System.out.println(count);

        long count1 = frase.stream()
                .map(i -> i.split(" "))
                .flatMap(Arrays::stream)
                .filter(i -> i.length() > 5)
                .count();

        System.out.println(count1);

        frase.stream()
                .map(i -> i.split(" "))
                .flatMap(Arrays::stream)
                .reduce((s, s2) -> s.length() > s2.length() ? s : s2)
                .ifPresent(System.out::println);

        List<String> list = frase.stream()
                .map(i -> i.split(" "))
                .flatMap(Arrays::stream)
                .toList();

        System.out.println(list);

        boolean temJava = frase.stream()
                .map(i -> i.split(" "))
                .flatMap(Arrays::stream)
                .anyMatch(s -> s.contains("java"));

        System.out.println(temJava);
    }
}
