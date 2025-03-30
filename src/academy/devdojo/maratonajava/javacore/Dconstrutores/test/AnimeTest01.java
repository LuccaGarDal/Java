package academy.devdojo.maratonajava.javacore.Dconstrutores.test;

import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Haikyuu","TV",12, "Ação", "Production IG");
        anime.imprime();
    }
}

// nesse caso, o construtor foi usado para inicialziar e delegar os atributos nele mesmo, sem a necessidade da
// criação de métodos

// e da mesma forma, foi feita a sobrecarga de construtores para permitir a criação de objetos sem parâmetros

// NÃO ADICIONAR VOID NOS CONSTRUTORES