package academy.devdojo.maratonajava.exercicios.ExerciciosIntroducao;

import java.util.Scanner;

public class Exercicio5Salario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salarioMinimo = 1293.20;
        System.out.println("Digite o seu salário: ");
        double salarioUsuario = entrada.nextDouble();
        double quantidadeDeSalarios = salarioUsuario/salarioMinimo;
        System.out.println("Você ganha "+quantidadeDeSalarios+" salários mínimos.");
    }
}
