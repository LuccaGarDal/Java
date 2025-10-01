package academy.devdojo.maratonajava.exercicios.ExercicioTreeSet;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSet02 {
    static void main(String[] args) {
        NavigableSet<String> nomes = new TreeSet<>();
        nomes.add("Lucca");
        nomes.add("Josué");
        nomes.add("Iann");
        nomes.add("Gabriel");
        nomes.add("Gabriel");

        for (String nome : nomes.descendingSet()) {
            System.out.println(nome);
        }

    }
}
