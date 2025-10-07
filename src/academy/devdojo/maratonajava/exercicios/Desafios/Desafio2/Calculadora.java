package academy.devdojo.maratonajava.exercicios.Desafios.Desafio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculadora {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> notas = new ArrayList<>();
        double nota = 0.0;

        while (!(nota == -1)) {
            System.out.println("Digite uma nota: ");
            nota = scanner.nextDouble();
            notas.add(nota);
        }

        double soma = 0;

        for (Double nota1 : notas) {
            if (nota1 == -1) {
                break;
            } else {
                soma = soma + nota1;
            }
        }

        double tamanho = notas.size() - 1;
        double media = soma/tamanho;
        System.out.println(media);


    }
}
