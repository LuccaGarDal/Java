package academy.devdojo.maratonajava.exercicios.ExerciciosLambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda03 {
    static void main(String[] args) {
        //Imprimindo apenas números pares (o "removeif" remove os elementos que cumprem a condição
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);

        integerList.removeIf(a -> a % 2 != 0);

        System.out.println(integerList);
    }
}
