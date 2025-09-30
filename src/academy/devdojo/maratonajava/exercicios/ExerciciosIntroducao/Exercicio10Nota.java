package academy.devdojo.maratonajava.exercicios.ExerciciosIntroducao;

import java.util.Scanner;

public class Exercicio10Nota {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite sua primeira nota: ");
        double nota1 = entrada.nextDouble();
        System.out.println("Digite sua segunda nota: ");
        double nota2 = entrada.nextDouble();
        System.out.println("Digite sua terceira nota: ");
        double nota3 = entrada.nextDouble();
        double soma = nota1 + nota2 + nota3;
        double media = soma / 3;
        System.out.println("A sua média ficou: "+media);
    }
}
