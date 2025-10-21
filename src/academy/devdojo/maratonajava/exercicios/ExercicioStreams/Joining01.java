package academy.devdojo.maratonajava.exercicios.ExercicioStreams;

import java.util.List;
import java.util.stream.Collectors;

public class Joining01 {
    static void main(String[] args) {
        List<String> linguagens = List.of("Java", "Python", "Kotlin", "C#");

        String collect = linguagens.stream()
                .collect(Collectors.joining(", ", "Linguagens: ", "."));


        System.out.println(collect);
    }
}
