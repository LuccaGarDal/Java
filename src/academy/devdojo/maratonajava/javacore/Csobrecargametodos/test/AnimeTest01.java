package academy.devdojo.maratonajava.javacore.Csobrecargametodos.test;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Akudama Drive","TV",12);
        anime.init("Akudama Drive","TV",12, "Ação");
        anime.imprime();

    }
}

// a sobrecarga de métodos acontece quando são criados métodos com o mesmo nome porém com quantidade de paraêmtros
// ou tipo de parâetros diferentes, como acontece no caso init

// no caso acima, o segundo metodo init está atribuindo os parametros nome, tipo e episodios aos this de cada um
// no init acima dele

// o tipo e/ou a quantidade de parametros PRECISA ser diferente, para o objeto saber que metodo chamar de acordo
// com os parametros