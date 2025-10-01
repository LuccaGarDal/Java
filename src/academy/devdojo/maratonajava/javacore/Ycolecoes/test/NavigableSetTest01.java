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

public class NavigableSetTest01 {
    static void main() {
        NavigableSet<Smartphone> smartphones = new TreeSet<>(new SmartphoneNomeComparator());
        smartphones.add(new Smartphone("123", "Nokia"));
        System.out.println(smartphones);

        System.out.println("------------");

        NavigableSet<Manga> mangas = new TreeSet<>();
        mangas.add(new Manga(5L, "One Piece", 25));
        mangas.add(new Manga(2L, "Dragon Ball", 25));
        mangas.add(new Manga(3L, "Naruto", 25));
        mangas.add(new Manga(1L, "Bleach", 25));
        mangas.add(new Manga(4L, "Berserk", 25));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

    }
}