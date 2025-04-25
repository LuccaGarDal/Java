package academy.devdojo.maratonajava.exercicios;

import java.util.Scanner;

public class Exercicio3Igual {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int A = entrada.nextInt();
        System.out.println("Digite outro número: ");
        int B = entrada.nextInt();
        int soma = A + B;
        if (A - B == 0) {
            System.out.println("A soma de "+A+" e "+B+" é igual a "+soma);
        }else {
            System.out.println("Os números não são iguais, então não posso somar.");
        }
    }
}
