package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamTest02 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Oregairu", 0.99),
            new LightNovel("Dungeon", 1.99),
            new LightNovel("Monogatari", 4.99),
            new LightNovel("No game no life", 2.99),
            new LightNovel("Kiseiju", 7.00),
            new LightNovel("Kaiju n8", 4.00)
    ));
    static void main(String[] args) {

        List<String> titles = lightNovels.stream()
                .sorted(Comparator.comparing(LightNovel::getTitle))
                .filter(s -> s.getPrice() <= 4)
                .limit(3)
                .map(LightNovel::getTitle)
                .collect(Collectors.toList());

        System.out.println(titles);
    }
}
