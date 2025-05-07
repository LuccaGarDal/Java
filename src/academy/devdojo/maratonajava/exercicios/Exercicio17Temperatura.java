package academy.devdojo.maratonajava.exercicios;

import java.util.Scanner;

public class Exercicio17Temperatura {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite uma temperatura em fahrenheit: ");
        double tempFahr = entrada.nextDouble();
        double tempCel = (tempFahr - 32) * 5/9;
        System.out.println("A temperatura em Fahrenheit é: "+tempFahr);
        System.out.println("A temperatura em Celsius é: "+tempCel);
    }
}
