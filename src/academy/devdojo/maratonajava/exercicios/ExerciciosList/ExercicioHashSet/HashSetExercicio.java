package academy.devdojo.maratonajava.exercicios.ExerciciosList.ExercicioHashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetExercicio {
    static void main() {
        Set<Integer> numeros = new HashSet<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(3);
        numeros.add(1);

        for (Integer numero : numeros) {
            System.out.println(numero);
        }

    }
}
