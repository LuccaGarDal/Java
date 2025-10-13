package academy.devdojo.maratonajava.javacore.ZZDoptional.test;

import academy.devdojo.maratonajava.javacore.ZZDoptional.dominio.Manga;
import academy.devdojo.maratonajava.javacore.ZZDoptional.repository.MangaRepository;

import java.util.Optional;

public class OptionalTest02 {
    static void main(String[] args) {

        Optional<Manga> mangaByTitle = MangaRepository.findByTitle("One piece");
                mangaByTitle.ifPresent(manga -> manga.setTitle("One piece 2"));
        System.out.println(mangaByTitle);

        System.out.println("-------------");
        Manga mangaById = MangaRepository.findById(2)
                .orElseThrow(IllegalArgumentException::new);
        System.out.println(mangaById);

        System.out.println("-------------");
        Manga manga = MangaRepository.findByTitle("Naruto")
                .orElse(new Manga(3, "Naruto", 600));

        System.out.println(manga);

    }
}
