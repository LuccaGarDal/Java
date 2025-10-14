package academy.devdojo.maratonajava.exercicios.ExercicioStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap01 {
    static void main(String[] args) {
        List<String> words = new ArrayList<>(List.of("Monkey", "D.", "Luffy"));

        List<String> letras = words.stream()
                .map(s -> s.split(""))
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());
        System.out.println(letras);

    }
}
