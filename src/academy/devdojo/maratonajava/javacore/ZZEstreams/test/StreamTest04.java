package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest04 {
    static void main(String[] args) {
        List<List<String>> kingdom = new ArrayList<>();
        List<String> cavaleiros = List.of("Lucca", "Ions", "Jous");
        List<String> reis = List.of("Garcia");
        List<String> magos = List.of("Lin", "Pedro");
        kingdom.add(cavaleiros);
        kingdom.add(reis);
        kingdom.add(magos);

        for (List<String> list : kingdom) {
            for (String s : list) {
                System.out.println(s);
            }

        }
        System.out.println("-------------");
        kingdom.stream()
                .flatMap(Collection::stream)
                .forEach(System.out::println);


    }
}
