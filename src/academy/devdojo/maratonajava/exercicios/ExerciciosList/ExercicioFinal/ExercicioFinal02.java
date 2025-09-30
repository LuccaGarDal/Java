package academy.devdojo.maratonajava.exercicios.ExerciciosList.ExercicioFinal;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExercicioFinal02 {
    static void main() {
        Set<Livro> livros = new HashSet<>();
        livros.add(new Livro("O Alquimista", "Paulo Coleho", 1990));
        livros.add(new Livro("Harry Potter", "Rowling", 2001));
        livros.add(new Livro("Senhor dos Aneis", "Tolkien", 1966));
        livros.add(new Livro("O Chamado de Cthulhu", "Lovecraft", 1915));
        livros.add(new Livro("O Chamado de Cthulhu", "Lovecraft", 1915));

        for (Livro livro : livros) {
            System.out.println(livro);
        }

        System.out.println("-------------------");

        Set<Livro> livros1 = new TreeSet<>();
        livros1.add(new Livro("O Alquimista", "Paulo Coleho", 1990));
        livros1.add(new Livro("Harry Potter", "Rowling", 2001));
        livros1.add(new Livro("Senhor dos Aneis", "Tolkien", 1966));
        livros1.add(new Livro("O Chamado de Cthulhu", "Lovecraft", 1915));
        livros1.add(new Livro("O Chamado de Cthulhu", "Lovecraft", 1915));

        for (Livro livro : livros1) {
            System.out.println(livro);
        }


    }
}
