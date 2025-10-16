package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest11 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Oregairu", 0.99),
            new LightNovel("Dungeon", 1.99),
            new LightNovel("Monogatari", 4.99),
            new LightNovel("No game no life", 2.99),
            new LightNovel("Kiseiju", 7.00),
            new LightNovel("Kaiju n8", 4.00),
            new LightNovel("Kaiju n8", 4.00)
    ));

    static void main(String[] args) {

        lightNovels.stream().max(Comparator.comparing(LightNovel::getPrice)).ifPresent(System.out::println);
        lightNovels.stream().collect(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))).ifPresent(System.out::println);

        System.out.println(lightNovels.stream().mapToDouble(LightNovel::getPrice).sum());
        System.out.println(lightNovels.stream().collect(Collectors.summingDouble(LightNovel::getPrice)));

        lightNovels.stream().mapToDouble(LightNovel::getPrice).average().ifPresent(System.out::println);
        System.out.println(lightNovels.stream().collect(Collectors.averagingDouble(LightNovel::getPrice)));

        System.out.println(lightNovels.stream().collect(Collectors.summarizingDouble(LightNovel::getPrice)));

        System.out.println(lightNovels.stream().map(LightNovel::getTitle).collect(Collectors.joining(", ")));




    }
}
