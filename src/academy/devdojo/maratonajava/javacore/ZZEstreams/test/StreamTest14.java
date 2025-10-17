package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Category;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTest14 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Oregairu", 0.99, Category.ROMANCE),
            new LightNovel("Dungeon", 1.99, Category.FANTASY),
            new LightNovel("Monogatari", 4.99, Category.ROMANCE),
            new LightNovel("No game no life", 2.99, Category.FANTASY),
            new LightNovel("Kiseiju", 7.00, Category.DRAMA),
            new LightNovel("Kaiju n8", 4.00, Category.FANTASY )
    ));

    static void main(String[] args) {

        Map<Category, Long> collect = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.counting()));

        System.out.println(collect);

        Map<Category, Optional<LightNovel>> collect1 = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))));

        System.out.println(collect1);

        Map<Category, LightNovel> collect2 = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice)), Optional::get)));

        System.out.println(collect2);

    }
}
