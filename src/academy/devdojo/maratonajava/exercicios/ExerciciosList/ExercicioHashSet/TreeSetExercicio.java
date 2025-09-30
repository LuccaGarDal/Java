package academy.devdojo.maratonajava.exercicios.ExerciciosList.ExercicioHashSet;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExercicio {
    static void main() {
        Set<String> nomes = new TreeSet<>();
        nomes.add("Luccao");
        nomes.add("Jous");
        nomes.add("Iann");
        nomes.add("Zambio");

        for (String nome : nomes) {
            System.out.println(nome);
        }

    }
}
