package academy.devdojo.maratonajava.exercicios.ExercicioTreeSet;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSet01 {
    static void main() {
        NavigableSet<Integer> numeros = new TreeSet<>();
        numeros.add(5);
        numeros.add(2);
        numeros.add(3);
        numeros.add(1);
        numeros.add(2);

        for (Integer numero : numeros) {
            System.out.println(numero);
        }

    }
}
