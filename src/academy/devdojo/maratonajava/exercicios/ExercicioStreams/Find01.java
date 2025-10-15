package academy.devdojo.maratonajava.exercicios.ExercicioStreams;

import java.util.List;

public class Find01 {
    private static List<String> palavras = List.of("stream", "lambda", "java", "reduce", "flatmap");

    static void main(String[] args) {
        palavras.stream()
                .filter(s -> s.startsWith("f"))
                .findAny()
                .ifPresent(System.out::println);

        palavras.stream()
                .filter(s -> s.length() > 5)
                .findAny()
                .ifPresent(System.out::println);

        String verificar = palavras.stream()
                .filter(s -> s.matches("reduce1"))
                .findAny()
                .orElse("Nada encontrado");
        System.out.println(verificar);
    }
}
