package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Category;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Promotion;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest13 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Oregairu", 0.99, Category.ROMANCE),
            new LightNovel("Dungeon", 1.99, Category.FANTASY),
            new LightNovel("Monogatari", 4.99, Category.ROMANCE),
            new LightNovel("No game no life", 2.99, Category.FANTASY),
            new LightNovel("Kiseiju", 7.00, Category.DRAMA),
            new LightNovel("Kaiju n8", 4.00, Category.FANTASY )
    ));

    static void main(String[] args) {

        Map<Promotion, List<LightNovel>> collect = lightNovels
                .stream()
                .collect(Collectors.groupingBy(lightNovel -> lightNovel.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE));

        System.out.println(collect);

        Map<Category, Map<Promotion, List<LightNovel>>> collect1 = lightNovels.stream()
                .collect(Collectors
                        .groupingBy(LightNovel::getCategory, (Collectors
                                .groupingBy(lightNovel -> lightNovel.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE))));


        System.out.println(collect1);
    }
}
