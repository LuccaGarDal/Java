package academy.devdojo.maratonajava.exercicios.ExerciciosLambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda05 {
    static void main(String[] args) {
        List<String> nomes =  new ArrayList<>(List.of("Lucca", "Jous" , "Amaral"));
        nomes.removeIf(s -> s.matches("Lucca"));
        System.out.println(nomes);
    }
}
