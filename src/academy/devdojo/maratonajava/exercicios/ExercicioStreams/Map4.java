package academy.devdojo.maratonajava.exercicios.ExercicioStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Map4 {
    private static List<String> nomes = new ArrayList<>(List.of("Lucca", "jous", "IONS"));

    static void main(String[] args) {

        List<String> nomesMaiusculos = nomes.stream()
                .map(String::toUpperCase)
                .toList();
        System.out.println(nomesMaiusculos);

        List<String> nomesMinusculos = nomes.stream()
                .map(String::toLowerCase)
                .toList();
        System.out.println(nomesMinusculos);

        List<Integer> nomesTamanho = nomes.stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println(nomesTamanho);

        List<String> nomesOla = nomes.stream()
                .map(s -> s = "Olá: " + s)
                .toList();
        System.out.println(nomesOla);

        List<String> nomesMaiorQue4 = nomes.stream()
                .filter(s -> s.length() > 4)
                .map(String::toUpperCase)
                .toList();
        System.out.println(nomesMaiorQue4);

    }
}
