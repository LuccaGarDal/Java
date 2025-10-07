package academy.devdojo.maratonajava.exercicios.ExercicioGenerics.ClasseGenerica.ListaGenerica;

import java.util.ArrayList;
import java.util.List;

public class ListaGenericaTest01 {
    static void main(String[] args) {
        List<String> list = new ArrayList<>();
        ListaGenerica<String> listaGenerica = new ListaGenerica<>(list);
        listaGenerica.adicionar("Luccao");
        listaGenerica.adicionar("Josue");
        listaGenerica.adicionar("Iann");
        listaGenerica.adicionar("Garcia");

        for (String nome : listaGenerica.getLista()) {
            System.out.println(nome);
        }
        System.out.println(listaGenerica.obter(2));
        System.out.println(listaGenerica.tamanho());

    }
}
