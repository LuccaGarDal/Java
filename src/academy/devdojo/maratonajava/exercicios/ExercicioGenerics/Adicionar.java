package academy.devdojo.maratonajava.exercicios.ExercicioGenerics;

import java.util.ArrayList;
import java.util.List;

public class Adicionar {

    private void adiciona (List<? super Integer> list) {
        System.out.println(list);
    }

    static void main() {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);

        List<Number> numberList = new ArrayList<>();
        numberList.add(5);
        numberList.add(6);
        numberList.add(7);

        Adicionar adicionar = new Adicionar();
        adicionar.adiciona(integerList);

        adicionar.adiciona(numberList);
    }
}
