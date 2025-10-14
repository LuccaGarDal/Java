package academy.devdojo.maratonajava.exercicios.ExercicioStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FlatMap03 {
    static void main(String[] args) {
        Map<String, List<String>> pessoasHobbie = Map.of(
                "Lucca", List.of("Treinar, Jogar"),
                "Jous", List.of("Treinar, Rezar"),
                "Ions", List.of("Festejar, Jogar")
        );

        List<String> hobbies = pessoasHobbie.values().stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println(hobbies);

    }
}
