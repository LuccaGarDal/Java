package academy.devdojo.maratonajava.exercicios.ExerciciosList.ExercicioList;

import java.util.ArrayList;
import java.util.List;

public class ExercicioList01 {
    static void main() {
        List<Integer> numeros = new ArrayList<>();

        for (int i = 1; i < 21; i++) {
            numeros.add(i);

        }
        System.out.println(numeros);

        numeros.removeIf(numero -> numero % 2 == 0);

        System.out.println(numeros);

    }
}
