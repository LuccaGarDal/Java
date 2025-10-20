package academy.devdojo.maratonajava.exercicios.ExercicioStreams;

import java.util.List;

public class Reduce02 {
    static void main(String[] args) {
        List<Integer> numeros = List.of(3,7,2,8,5);

        numeros.stream()
                .reduce(Integer::max)
                .ifPresent(System.out::println);

        numeros.stream()
                .reduce(Integer::sum)
                .ifPresent(System.out::println);

        numeros.stream()
                .reduce((i, i2) -> i * i2)
                .ifPresent(System.out::println);
    }
}
