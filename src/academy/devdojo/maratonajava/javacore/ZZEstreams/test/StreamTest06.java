package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest06 {
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
        lightNovels.stream().anyMatch(lightNovel -> lightNovel.getPrice() > 5);
        lightNovels.stream().allMatch(lightNovel -> lightNovel.getPrice() > 0);
        lightNovels.stream().noneMatch(lightNovel -> lightNovel.getPrice() < 0);

        lightNovels.stream()
                .filter(lightNovel -> lightNovel.getPrice() > 3)
                .findAny()
                .ifPresent(System.out::println);

        lightNovels.stream()
                .filter(lightNovel -> lightNovel.getPrice() > 5)
                .sorted(Comparator.comparing(LightNovel::getTitle))
                .findFirst()
                .ifPresent(System.out::println);

        lightNovels.stream()
                .filter(lightNovel -> lightNovel.getPrice() > 5)
                .min(Comparator.comparing(LightNovel::getTitle))
                .ifPresent(System.out::println);
    }
}
