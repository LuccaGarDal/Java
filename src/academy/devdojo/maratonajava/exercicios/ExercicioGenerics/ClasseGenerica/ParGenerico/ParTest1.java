package academy.devdojo.maratonajava.exercicios.ExercicioGenerics.ClasseGenerica.ParGenerico;

import java.util.ArrayList;
import java.util.List;

public class ParTest1 {
    static void main(String[] args) {
        String nome = "Lucca";
        int numero = 1;
        Par<String, Integer> pares = new Par<>(nome, numero);
        Par<String, Integer> pares2 = new Par<>("Garcia", 2);
        Par<String, Integer> pares3 = new Par<>("Josue", 3);

        System.out.println(pares.getChave());
        System.out.println(pares.getValor());

        List<Par> listPares = new ArrayList<>();
        listPares.add(pares);
        listPares.add(pares2);
        listPares.add(pares3);

        for (Par par : listPares) {
            System.out.println(par.getChave() + " - " + par.getValor());
        }
    }
}
