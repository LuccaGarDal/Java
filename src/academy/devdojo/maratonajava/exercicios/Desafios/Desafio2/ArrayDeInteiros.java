package academy.devdojo.maratonajava.exercicios.Desafios.Desafio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayDeInteiros {
    static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite quantos números deseja digitar; ");
        int qntd = scan.nextInt();

        int[] numeros = new int[qntd];
        int soma = 0;
        int pares = 0;
        int impares = 0;

        for (int i = 0; i < qntd; i++) {
            System.out.println("Digite um número: ");
            numeros[i] = scan.nextInt();
        }

        for (int numero : numeros) {
            System.out.println(numero);
        }

        int maior = numeros[0];
        int menor = numeros[0];

        for (int numero : numeros) {
            soma += numero;

            if (numero > maior) maior = numero;
            if (numero < menor) menor = numero;

            if (numero % 2 == 0) pares++;
            else impares++;
        }

        double media = (double) soma / numeros.length;

            System.out.println("Resultados: ");
            System.out.println("Maior número: " + maior);
            System.out.println("Menor número: " + menor);
            System.out.println("Média: " + media);
            System.out.println("Pares: " + pares);
            System.out.println("Ímpares: " + impares);

    }
}
