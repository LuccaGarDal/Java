package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
    static void main(String[] args) {
        Queue<Manga> mangas = new PriorityQueue<>(new MangaPrecoComparator());
        mangas.add(new Manga(5L, "One Piece", 25));
        mangas.add(new Manga(2L, "Dragon Ball", 34.31));
        mangas.add(new Manga(3L, "Naruto", 16.23));
        mangas.add(new Manga(1L, "Bleach", 12.02));
        mangas.add(new Manga(4L, "Berserk", 23));

        while (!mangas.isEmpty()) {
            System.out.println(mangas.poll());
        }
    }
}
