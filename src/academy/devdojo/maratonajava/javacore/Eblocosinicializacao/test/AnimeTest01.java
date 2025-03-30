package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.test;

import academy.devdojo.maratonajava.javacore.Eblocosinicializacao.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio + " ");
            
        }

    }
}

// No caso acima, como foi executado o objeto sem argumentos foi executado o seguinte:
//             1 - O bloco de inicialização foi executado, mostrando os episodios
//             2 - O construtor sem argumentos foi executado, mostrando novamente os episodios