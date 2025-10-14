package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest05 {
    static void main(String[] args) {
        List<String> lista = new ArrayList<>(List.of("Gomu", "Gomu", "No", "Mi"));
        String[] letters = lista.get(0).split("");
        System.out.println(Arrays.toString(letters));

        List<String> letters2 = lista.stream()
                .map(s -> s.split(""))
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());
        System.out.println(letters2);
    }
}
