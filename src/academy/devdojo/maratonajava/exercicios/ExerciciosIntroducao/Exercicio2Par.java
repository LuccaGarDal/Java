package academy.devdojo.maratonajava.exercicios.ExerciciosIntroducao;

import java.util.Scanner;

public class Exercicio2Par {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int A = entrada.nextInt();
        if (A % 2 == 0) {
            System.out.println("Este número é par");

        }else {
            System.out.println("Este número é impar");
        }

        if (A > 0) {
            System.out.println("Este número é positivo");
        }
        else if (A == 0){
            System.out.println("Este número é 0, não sendo positivo ou negativo");
        }
        else {
            System.out.println("Este número é negativo");
        }

    }
}
