package academy.devdojo.maratonajava.exercicios.ExerciciosList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExercicioList02 {
    static void main() {
        List<String> nomes = new ArrayList<>();
        nomes.add("Lucca");
        nomes.add("Iann");
        nomes.add("Josué");
        nomes.add("Garcia");
        nomes.add("Vini");

        Collections.sort(nomes);
        for (String nome : nomes) {
            System.out.println(nome);
        }

        System.out.println("---------");

        Collections.sort(nomes, Collections.reverseOrder());
        for (String nome : nomes) {
            System.out.println(nome);
        }


    }
}
