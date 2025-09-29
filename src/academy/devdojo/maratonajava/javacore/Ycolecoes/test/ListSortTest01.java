package academy.devdojo.maratonajava.javacore.Ycolecoes.test;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    static void main() {
        List<String> mangas = new ArrayList<>(6);
        mangas.add("One piece");
        mangas.add("Berserk");
        mangas.add("Dragon Ball");
        mangas.add("Naruto");
        mangas.add("Nana");

        List<Double> numeros = new ArrayList<>(16);
        numeros.add(12D);
        numeros.add(12.2);
        numeros.add(25.3);
        numeros.add(0.5);

        Collections.sort(mangas);
        Collections.sort(numeros);

        for (String manga : mangas) {
            System.out.println(manga);
        }

        System.out.println(numeros);

    }
}
