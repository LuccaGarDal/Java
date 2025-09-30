package academy.devdojo.maratonajava.exercicios.ExerciciosIntroducao;

import java.util.Scanner;

public class Exercicio6Reajuste {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        double valor = entrada.nextDouble();
        double valorReajustado = valor + valor * 0.05;
        System.out.println("Com um reajuste de 5% o valor fica "+valorReajustado);
    }
}
