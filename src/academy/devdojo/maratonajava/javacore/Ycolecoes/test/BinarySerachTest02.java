package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySerachTest02 {
    static void main() {
        MangaByIdComparator mangaByIdComparator = new MangaByIdComparator();
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(5L, "One Piece", 25));
        mangas.add(new Manga(2L, "Dragon Ball", 25));
        mangas.add(new Manga(3L, "Naruto", 25));
        mangas.add(new Manga(1L, "Bleach", 25));
        mangas.add(new Manga(4L, "Berserk", 25));

        mangas.sort(mangaByIdComparator);

        for (Manga manga : mangas) {
            System.out.println(manga);

        }

        Manga mangaToSearch = new Manga(5L, "One Piece", 25);
        System.out.println(Collections.binarySearch(mangas, mangaToSearch, mangaByIdComparator));


    }
}
