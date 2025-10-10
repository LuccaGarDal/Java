package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import academy.devdojo.maratonajava.javacore.ZZClambdas.dominio.Anime;
import academy.devdojo.maratonajava.javacore.ZZClambdas.service.AnimeComparator;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTest02 {
    static void main(String[] args) {
        AnimeComparator animeComparator = new AnimeComparator();
        List<Anime> animes = new ArrayList<>();
        animes.add(new Anime("One piece", 1000));
        animes.add(new Anime("Dragon Ball", 300));
        animes.add(new Anime("Naruto", 500));

        animes.sort(animeComparator::compareByEspisodesNonStatic);

        System.out.println(animes);
    }
}
