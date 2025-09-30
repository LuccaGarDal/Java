package academy.devdojo.maratonajava.exercicios.ExerciciosIntroducao;

import java.util.Scanner;

public class Exercicio14Troca {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um valor A: ");
        int A = entrada.nextInt();
        System.out.println("Digite um valor B: ");
        int B = entrada.nextInt();

        int temporario = A;
        A = B;
        B = temporario;
        System.out.println("Trocando o valor de A por B, o valor de A é: " + A);
        System.out.println("Trocando o valor de B por A, o valor de B é: " + B);

    }
}
