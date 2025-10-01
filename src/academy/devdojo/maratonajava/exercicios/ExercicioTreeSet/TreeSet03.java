package academy.devdojo.maratonajava.exercicios.ExercicioTreeSet;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSet03 {
    static void main(String[] args) {
        NavigableSet<Pessoa> pessoas = new TreeSet<>();
        pessoas.add(new Pessoa("Lucca Garcia", 15));
        pessoas.add(new Pessoa("Josué Kuhim", 16));
        pessoas.add(new Pessoa("Iann Lino", 14));

        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }

    }
}
