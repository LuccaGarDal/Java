package academy.devdojo.maratonajava.exercicios.ExercicioStreams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Frase01 {
    static void main(String[] args) {
        List<String> frases = List.of(
                "O java é muito legal", "Adoro java e linguagens", "Gostaria de adoro o java linguagens"

        );

        Map<String, Long> collect = frases.stream()
                .flatMap(s -> Arrays.stream(s.split(" ")))
                .collect(Collectors.groupingBy(String::toLowerCase, Collectors.counting()));

        System.out.println(collect);


    }

}
