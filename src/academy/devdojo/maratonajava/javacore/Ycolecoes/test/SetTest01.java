package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.HashSet;
import java.util.Set;

public class SetTest01 {
    static void main(String[] args) {
        Set<Manga> mangas = new HashSet<>();
        mangas.add(new Manga(5L, "One Piece", 25));
        mangas.add(new Manga(2L, "Dragon Ball", 25));
        mangas.add(new Manga(3L, "Naruto", 25, 1));
        mangas.add(new Manga(1L, "Bleach", 25));
        mangas.add(new Manga(4L, "Berserk", 25));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

    }
}
