package academy.devdojo.maratonajava.exercicios.ExerciciosList.ExercicioFinal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class CompareByAnoPublicacao implements Comparator<Livro>{
    @Override
    public int compare(Livro livro1, Livro livro2) {
        return Double.compare(livro1.getAnoPublicacao(), livro2.getAnoPublicacao());
    }
}


public class ExercicioFinal01 {
    static void main() {
        List<Livro> livros = new ArrayList<>();
        livros.add(new Livro("O Alquimista", "Paulo Coleho", 1990));
        livros.add(new Livro("Harry Potter", "Rowling", 2001));
        livros.add(new Livro("Senhor dos Aneis", "Tolkien", 1966));
        livros.add(new Livro("O Chamado de Cthulhu", "Lovecraft", 1915));
        livros.add(new Livro("O Chamado de Cthulhu", "Lovecraft", 1915));

        Collections.sort(livros);

        for (Livro livro : livros) {
            System.out.println(livro);
        }

        System.out.println("------------------");

        Collections.sort(livros, new CompareByAnoPublicacao());

        for (Livro livro : livros) {
            System.out.println(livro);
        }



    }
}
