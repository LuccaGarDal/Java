package academy.devdojo.maratonajava.exercicios.ExercicioTreeSet;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class PessoaComparatorByIdade implements Comparator<Pessoa> {
    @Override
    public int compare(Pessoa o1, Pessoa o2) {
        return Integer.compare(o1.getIdade(), o2.getIdade());
    }
}

public class TreeSet04 {
    static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Leo Lins", 31);
        Pessoa pessoa2 = new Pessoa("Mauricio Meirelles", 43);
        Pessoa pessoa3 = new Pessoa("Renato Albani", 38);
        Pessoa pessoa4 = new Pessoa("Matheus Canela", 27);

        NavigableSet<Pessoa> pessoas = new TreeSet<>(new PessoaComparatorByIdade());
        pessoas.add(pessoa1);
        pessoas.add(pessoa2);
        pessoas.add(pessoa3);
        pessoas.add(pessoa4);

        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }

    }
}
