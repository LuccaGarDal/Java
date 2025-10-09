package academy.devdojo.maratonajava.exercicios.ExercicioMethodReference;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Flow;

class Print {
    public static void printer (Object object) {
        System.out.println("Valor: " + object);
    }
}

public class MRestatico01 {
    static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);

        nums.forEach(Print::printer);

        List<String> nomes = List.of("Lucca", "Garcia", "Daltro");

        nomes.forEach(Print::printer);

    }
}
