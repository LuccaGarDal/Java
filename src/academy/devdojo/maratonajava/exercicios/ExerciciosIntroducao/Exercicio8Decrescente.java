package academy.devdojo.maratonajava.exercicios.ExerciciosIntroducao;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio8Decrescente {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int A = entrada.nextInt();
        int B = entrada.nextInt();
        int C = entrada.nextInt();

        int[] valores = {A, B, C};
        Arrays.sort(valores);

        System.out.println("Os valores em ordem decrescente ficam: ");
        for (int i = valores.length - 1; i >= 0; i--) {
            System.out.println(valores [i] + " ");
        }
    }
}
