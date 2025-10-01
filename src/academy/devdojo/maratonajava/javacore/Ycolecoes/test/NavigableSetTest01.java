package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneNomeComparator implements Comparator<Smartphone> {
    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getNome().compareTo(o2.getNome());
    }
}

class MangaPrecoComparator implements Comparator<Manga> {

    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}

public class NavigableSetTest01 {
    static void main() {
        NavigableSet<Smartphone> smartphones = new TreeSet<>(new SmartphoneNomeComparator());
        smartphones.add(new Smartphone("123", "Nokia"));
        System.out.println(smartphones);

        System.out.println("------------");

        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPrecoComparator());
        mangas.add(new Manga(5L, "One Piece", 25));
        mangas.add(new Manga(2L, "Dragon Ball", 34.31));
        mangas.add(new Manga(3L, "Naruto", 16.23));
        mangas.add(new Manga(1L, "Bleach", 12.02));
        mangas.add(new Manga(4L, "Berserk", 23));

        for (Manga manga : mangas.descendingSet()) {
            System.out.println(manga);
        }

        System.out.println("----------------");

        Manga mangaReferencia = new Manga(12L, "Hunter x Hunter", 23 );

        System.out.println(mangas.lower(mangaReferencia));
        System.out.println(mangas.floor(mangaReferencia));
        System.out.println(mangas.higher(mangaReferencia));
        System.out.println(mangas.ceiling(mangaReferencia));

        System.out.println(mangas.size());
        System.out.println(mangas.pollFirst());
        System.out.println(mangas.pollLast());
        System.out.println(mangas.size());


    }
}