package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest01 {
    static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(5L, "One Piece", 25));
        mangas.add(new Manga(2L, "Dragon Ball", 25));
        mangas.add(new Manga(3L, "Naruto", 25, 1));
        mangas.add(new Manga(1L, "Bleach", 25));
        mangas.add(new Manga(4L, "Berserk", 25));

        Iterator<Manga> mangaIterator = mangas.iterator();
        while (mangaIterator.hasNext()) {
            if (mangaIterator.next().getQuantidade() == 0) {
                mangaIterator.remove();
            }
        }
        for (Manga manga : mangas) {
            System.out.println(manga);

        }

//        mangas.removeIf(manga -> manga.getQuantidade() == 0);
//        System.out.println(mangas);

    }
}
