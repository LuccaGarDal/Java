package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest03 {
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
        Stream<LightNovel> stream = lightNovels.stream();
        lightNovels.forEach(System.out::println);

        long count = stream
                .distinct()
                .filter(s -> s.getPrice() <= 4)
                .count();

        System.out.println(count);
    }
}
