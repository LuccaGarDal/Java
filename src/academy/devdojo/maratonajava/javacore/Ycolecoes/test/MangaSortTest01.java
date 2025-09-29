package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MangaSortTest01 {
    static void main() {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(5L, "One Piece", 25));
        mangas.add(new Manga(2L, "Dragon Ball", 25));
        mangas.add(new Manga(3L, "Naruto", 25));
        mangas.add(new Manga(1L, "Bleach", 25));
        mangas.add(new Manga(4L, "Berserk", 25));

        Collections.sort(mangas);

        for (Manga manga : mangas) {
            System.out.println(manga);

        }

    }
}
