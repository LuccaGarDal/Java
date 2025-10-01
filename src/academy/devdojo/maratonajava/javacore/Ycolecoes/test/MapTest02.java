package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    static void main() {
        Consumidor consumidor1 = new Consumidor("Lucca Garcia");
        Consumidor consumidor2 = new Consumidor("Josué Kuhim");

        Manga manga1 = (new Manga(5L, "One Piece", 25));
        Manga manga2 = (new Manga(2L, "Dragon Ball", 25));
        Manga manga3 = (new Manga(3L, "Naruto", 25, 1));
        Manga manga4 = (new Manga(1L, "Bleach", 25));
        Manga manga5 = (new Manga(4L, "Berserk", 25));

        Map<Consumidor, Manga> consumidorMangaMap = new HashMap<>();
        consumidorMangaMap.put(consumidor1, manga1);
        consumidorMangaMap.put(consumidor2, manga4);

        for (Map.Entry<Consumidor, Manga> entry : consumidorMangaMap.entrySet()) {
            System.out.println(entry.getKey().getNome() + " - " + entry.getValue().getNome());

        }


    }
}
