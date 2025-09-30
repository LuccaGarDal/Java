package academy.devdojo.maratonajava.exercicios.ExerciciosIntroducao;

import java.util.Scanner;

public class Exercicio7Booleanos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean A = entrada.nextBoolean();
        boolean B = entrada.nextBoolean();
        if (A) {
            System.out.println("O primeiro valor é verdadeiro");
        } else {
            System.out.println("O primeiro valor é falso");
        }
        if (B) {
            System.out.println("O segundo valor é verdadeiro");
        } else {
            System.out.println("O segundo valor é falso");
        }
    }
}
