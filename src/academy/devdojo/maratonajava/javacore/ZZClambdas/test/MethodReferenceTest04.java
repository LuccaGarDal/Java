package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import academy.devdojo.maratonajava.javacore.ZZClambdas.dominio.Anime;
import academy.devdojo.maratonajava.javacore.ZZClambdas.service.AnimeComparator;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class MethodReferenceTest04 {
    static void main(String[] args) {
        Supplier<AnimeComparator> newAnimeComparator = AnimeComparator::new;
        AnimeComparator animeComparator = newAnimeComparator.get();
        List<Anime> animes = new ArrayList<>();

        animes.add(new Anime("One piece", 1000));
        animes.add(new Anime("Dragon Ball", 300));
        animes.add(new Anime("Naruto", 500));

        animes.sort(animeComparator::compareByEspisodesNonStatic);

        BiFunction<String, Integer, Anime> biFunction = Anime::new;
        System.out.println(biFunction.apply("One piece", 1000));


    }
}
