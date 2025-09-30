package academy.devdojo.maratonajava.exercicios.ExerciciosIntroducao;

import java.util.Scanner;

public class Exercicio22Quociente {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int A = entrada.nextInt();
        System.out.println("Digite outro valor");
        int B = entrada.nextInt();
        int quociente = A / B;
        int resto = A % B;
        System.out.println("O quociente da divisão de "+A+" por "+B+" resulta em "+quociente);
        System.out.println("O resto da divisão de "+A+" por "+B+" resulta em "+resto);
    }
}
