package academy.devdojo.maratonajava.exercicios.ExercicioQueue;

import java.util.ArrayList;
import java.util.List;

public class Calcular {

    private double somar (List<? extends Number> list) {
        double soma = 0;
        for (Number number : list) {
            soma += number.doubleValue();
        }
        return soma;
    }

    static void main() {
        List<Double> numDouble = new ArrayList<>();
        numDouble.add(1D);
        numDouble.add(2D);

        List<Integer> numInteger = new ArrayList<>();
        numInteger.add(3);
        numInteger.add(5);


        Calcular calcular = new Calcular();
        System.out.println(calcular.somar(numDouble));
        System.out.println(calcular.somar(numInteger));
    }
}
