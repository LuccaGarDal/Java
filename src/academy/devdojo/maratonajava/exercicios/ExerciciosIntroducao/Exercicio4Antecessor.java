package academy.devdojo.maratonajava.exercicios.ExerciciosIntroducao;

import java.util.Scanner;

public class Exercicio4Antecessor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int A = entrada.nextInt();
        int B = A - 1;
        int C = A + 1;
        System.out.println("O antecessor de "+A+" é "+B);
        System.out.println("O sucessor de "+A+" é "+C);
    }
}
