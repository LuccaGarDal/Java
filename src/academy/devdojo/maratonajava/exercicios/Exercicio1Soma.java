package academy.devdojo.maratonajava.exercicios;

import java.util.Scanner;

public class Exercicio1Soma {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int A = entrada.nextInt();
        System.out.println("Digite outro número: ");
        int B = entrada.nextInt();
        System.out.println("Digite mais um número: ");
        int C = entrada.nextInt();
        int soma = A + B;
        boolean isMaiorQueC = soma > C;

        if (isMaiorQueC) {
            System.out.println("A soma é: " + soma);
            System.out.println("A soma de " + A + "+" + B + " resulta em " + soma + ", portanto, é maior que " + C);
        } else if (soma == C) {
            System.out.println("A soma é: " + soma);
            System.out.println("A soma é: " + soma + " portanto, é igual a " + C);

        } else {
            System.out.println("A soma é: " + soma);
            System.out.println("A soma de " + A + "+" + B + " resulta em " + soma + ", portanto, é menor que " + C);
        }
        System.out.println("master");
    }
}
