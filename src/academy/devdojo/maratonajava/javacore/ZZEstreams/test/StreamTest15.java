package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Category;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Promotion;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

public class StreamTest15 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Oregairu", 0.99, Category.ROMANCE),
            new LightNovel("Dungeon", 1.99, Category.FANTASY),
            new LightNovel("Monogatari", 4.99, Category.ROMANCE),
            new LightNovel("No game no life", 2.99, Category.FANTASY),
            new LightNovel("Kiseiju", 7.00, Category.DRAMA),
            new LightNovel("Kaiju n8", 7.00, Category.FANTASY )
    ));

    static void main(String[] args) {
        Map<Category, DoubleSummaryStatistics> collect = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.summarizingDouble(LightNovel::getPrice)));

        System.out.println(collect);

        Map<Category, List<Promotion>> collect1 = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.mapping(StreamTest15::getPromotion, toList())));

        System.out.println(collect1);

        Map<Category, Set<Promotion>> collect2 = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.mapping(StreamTest15::getPromotion, toSet())));

        System.out.println(collect2);

        Map<Category, LinkedHashSet<Promotion>> collect3 = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.mapping(StreamTest15::getPromotion, Collectors.toCollection(LinkedHashSet::new))));

        System.out.println(collect3);

    }

    private static Promotion getPromotion(LightNovel lightNovel) {
        return lightNovel.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE;
    }
}
