package academy.devdojo.maratonajava.exercicios;

import java.util.Scanner;

public class Exercicio3Igual {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int A = entrada.nextInt();
        System.out.println("Digite outro número: ");
        int B = entrada.nextInt();
        int C;
        if (A - B == 0) {
            C = A + B;
            System.out.println("A soma de "+A+" e "+B+" é igual a "+C);
        }else {
            C = A * B;
            System.out.println("A multiplicação de "+A+" e "+B+" é igual a "+C);
        }
    }
}
