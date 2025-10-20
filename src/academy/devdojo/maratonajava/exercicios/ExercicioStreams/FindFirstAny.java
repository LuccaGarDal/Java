package academy.devdojo.maratonajava.exercicios.ExercicioStreams;

import java.util.List;

public class FindFirstAny {
    static void main(String[] args) {
        List<String> palavras = List.of("stream", "lambda", "flatmap", "java", "compilation");

        palavras.stream()
                .filter(s -> s.length() > 5)
                .findFirst()
                .ifPresent(System.out::println);

        palavras.stream()
                .filter(s -> s.contains("a"))
                .findAny()
                .ifPresent(System.out::println);

    }
}
