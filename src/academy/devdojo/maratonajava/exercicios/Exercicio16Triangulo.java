package academy.devdojo.maratonajava.exercicios;

import java.util.Scanner;

public class Exercicio16Triangulo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite 3 valores para determinação dos lados de um triângulo");
        System.out.println("Primeiro Valor: ");
        int A = entrada.nextInt();
        System.out.println("Segundo Valor: ");
        int B = entrada.nextInt();
        System.out.println("Terceiro Valor: ");
        int C = entrada.nextInt();

        if (A + B > C && C + A > B && B + C > A) {
            System.out.println("Os lados conseguem formar um triângulo!");
        } else {
            System.out.println("Os lados não conseguem formar um triângulo... tente novamente.");
        }

        if (A == B && B == C) {
            System.out.println("O triângulo é equilátero");
        } else if (A == B || B == C || C == A) {
            System.out.println("O triângulo é isósceles");
        } else {
            System.out.println("O triângulo é escaleno");
        }
    }
}
