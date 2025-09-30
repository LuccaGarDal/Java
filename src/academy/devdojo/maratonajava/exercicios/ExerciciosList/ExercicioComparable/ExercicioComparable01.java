package academy.devdojo.maratonajava.exercicios.ExerciciosList.ExercicioComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExercicioComparable01 {
    static void main() {
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Iphone", 15000));
        produtos.add(new Produto("Computador", 7000));
        produtos.add(new Produto("Melancia", 25.00));
        produtos.add(new Produto("Copo", 4.00));
        produtos.add(new Produto("Cerva", 8.75));

        Collections.sort(produtos);

        for (Produto produto : produtos) {
            System.out.println(produto);

        }


    }
}
