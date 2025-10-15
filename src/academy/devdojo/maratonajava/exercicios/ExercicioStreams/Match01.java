package academy.devdojo.maratonajava.exercicios.ExercicioStreams;

import java.util.List;

public class Match01 {
    private static List<Integer> numeros = List.of(3,7,10,15,22,30);

    static void main(String[] args) {

        boolean ehPar = numeros.stream()
                .allMatch(s -> s % 2 == 0);
        System.out.println(ehPar);

        boolean ehDivisivelPor5 = numeros.stream()
                .anyMatch(s -> s % 5 == 0);
        System.out.println(ehDivisivelPor5);

        boolean ehNegativo = numeros.stream()
                .noneMatch(s -> s < 0);
        System.out.println(ehNegativo);

        boolean ehMaiorQueVinteEPar = numeros.stream()
                .filter(integer -> integer > 20)
                .anyMatch(integer -> integer % 2 == 0);
        System.out.println(ehMaiorQueVinteEPar);
    }
}
