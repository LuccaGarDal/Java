package academy.devdojo.maratonajava.exercicios.ExercicioStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap02 {
    static void main() {

        List<String> frases = new ArrayList<>(List.of("Meu nome é Luffy", "Serei rei"));

        List<String> palavras = frases.stream()
                .map(s -> s.split(" "))
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());

        System.out.println(palavras);


    }
}


