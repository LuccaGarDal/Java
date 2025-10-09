package academy.devdojo.maratonajava.exercicios.ExerciciosLambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Lambda02 {
    static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Lucca");
        nomes.add("Josué");
        nomes.add("Iann");
        nomes.add("Gabriel");
        nomes.add("Vinicius");

        nomes.sort((a, b) -> Integer.compare(a.length(), b.length()));

        System.out.println(nomes);
        
    }
}
