package academy.devdojo.maratonajava.exercicios.ExercicioStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Map3 {
    static void main(String[] args) {
        List<String> palavras = new ArrayList<>(List.of("Eu", "Sou", "Monkey", "D.", "Luffy"));

        List<String[]> letras = palavras.stream()
                .map(s -> s.split(""))
                .collect(Collectors.toList());
        for (String[] letra : letras) {
            System.out.println(Arrays.toString(letra));
        }

    }
}
