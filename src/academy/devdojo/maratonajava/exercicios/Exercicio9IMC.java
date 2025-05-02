package academy.devdojo.maratonajava.exercicios;

import java.util.Scanner;

public class Exercicio9IMC {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double altura = entrada.nextDouble();
        double peso = entrada.nextDouble();
        double altura2 = altura * altura;
        double imc = peso / altura2;
        System.out.println(imc);

        if (imc >= 0 && imc <= 18.5) {
            System.out.println("Você está abaixo do peso");
        } else if (imc >= 18.6 && imc <= 24.9) {
            System.out.println("Você está no peso ideal");
        } else if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("Você está levemente acima do peso");
        } else if (imc >= 30.0 && imc <= 34.9) {
            System.out.println("Você está com obesidade grau I ");
        } else if (imc >= 35.0 && imc <= 39.9) {
            System.out.println("Você está com obesidade grau II (severa)");
        } else if (imc >= 40.0) {
            System.out.println("Você está com obesidade grau II (mórbida)");
        }
        else {
            System.out.println("Você digitou algo errado, reveja os valores");
        }
    }
}
