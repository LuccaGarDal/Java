package academy.devdojo.maratonajava.exercicios.ExercicioStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Map1 {
    static void main(String[] args) {
        List<String> palavras = new ArrayList<>(List.of("gomu", "gomu", "no", "mi"));

        List<String> upper = palavras.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(upper);
    }
}
