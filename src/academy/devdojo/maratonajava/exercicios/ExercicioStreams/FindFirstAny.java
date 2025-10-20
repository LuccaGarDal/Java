package academy.devdojo.maratonajava.exercicios.ExercicioStreams;

import java.util.List;

public class FindFirstAny {
    static void main(String[] args) {
        List<String> palavras = List.of("stream", "lambada", "flatmap", "java", "compilation");

        palavras.stream()
                .filter(s -> s.length() > 5)
                .findFirst()
                .ifPresent(System.out::println);
    }
}
