package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import academy.devdojo.maratonajava.javacore.ZZClambdas.dominio.Anime;
import academy.devdojo.maratonajava.javacore.ZZClambdas.service.AnimeComparator;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTest01 {
    static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>();
        animeList.add(new Anime("One piece", 1100));
        animeList.add(new Anime("Naruto", 500));
        animeList.add(new Anime("Sakurasou", 25));

        animeList.sort(AnimeComparator::compareByEpisodes);
        System.out.println(animeList);
        System.out.println("-------------");
        animeList.sort(AnimeComparator::compareByTitle);
        System.out.println(animeList);
    }
}
