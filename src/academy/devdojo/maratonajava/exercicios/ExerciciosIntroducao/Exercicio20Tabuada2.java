package academy.devdojo.maratonajava.exercicios.ExerciciosIntroducao;

import java.util.Scanner;

public class Exercicio20Tabuada2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = entrada.nextInt();
        System.out.println("Aqui está a tabuada do número " + num);
        for (int i = 1; i <= 10; i++) {
            int result = num * i;
            System.out.println(num + " X " + i + " = " + result);
        }
    }
}
