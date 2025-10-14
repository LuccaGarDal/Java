package academy.devdojo.maratonajava.exercicios.ExercicioStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Map2 {
    static void main(String[] args) {
        List<String> nomes = new ArrayList<>(List.of("Lucca", "Jous"));

        List<Integer> tamanho = nomes.stream()
                .map(String::length)
                .collect(Collectors.toList());

        System.out.println(tamanho);

    }
}
