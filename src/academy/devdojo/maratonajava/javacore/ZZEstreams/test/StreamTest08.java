package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StreamTest08 {
        private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
                new LightNovel("Oregairu", 0.99),
                new LightNovel("Dungeon", 1.99),
                new LightNovel("Monogatari", 4.99),
                new LightNovel("No game no life", 2.99),
                new LightNovel("Kiseiju", 7.00),
                new LightNovel("Kaiju n8", 4.00)
        ));

    static void main(String[] args) {

        lightNovels.stream()
                .map(LightNovel::getPrice)
                .filter(aDouble -> aDouble > 3)
                .reduce(Double::sum)
                .ifPresent(System.out::println);

        double sum = lightNovels.stream()
                .mapToDouble(LightNovel::getPrice)
                .filter(s -> s > 3)
                .sum();
        System.out.println(sum);

    }
}
