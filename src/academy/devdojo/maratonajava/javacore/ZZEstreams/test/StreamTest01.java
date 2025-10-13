package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest01 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Oregairu", 0.99),
            new LightNovel("Dungeon", 1.99),
            new LightNovel("Monogatari", 4.99),
            new LightNovel("No game no life", 2.99),
            new LightNovel("Kiseiju", 7.00),
            new LightNovel("Kaiju n8", 4.00)
    ));
    static void main(String[] args) {
        lightNovels.sort(Comparator.comparing(LightNovel::getTitle));
        System.out.println(lightNovels);

        List<LightNovel> novelsPrice = new ArrayList<>();
        for (LightNovel lightNovel : lightNovels) {
            if (lightNovel.getPrice() <= 4) {
                novelsPrice.add(lightNovel);
            }
            if (novelsPrice.size() >= 3) {
                break;
            }
        }
        System.out.println(novelsPrice);

    }
}
