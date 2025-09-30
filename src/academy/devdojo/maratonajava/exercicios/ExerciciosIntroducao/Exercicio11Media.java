package academy.devdojo.maratonajava.exercicios.ExerciciosIntroducao;

import java.util.Scanner;

public class Exercicio11Media {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = entrada.next();
        System.out.println("Digite sua primeira nota: ");
        double nota1 = entrada.nextDouble();
        System.out.println("Digite sua segunda nota: ");
        double nota2 = entrada.nextDouble();
        System.out.println("Digite sua terceira nota: ");
        double nota3 = entrada.nextDouble();
        System.out.println("Digite sua quarta nota: ");
        double nota4 = entrada.nextDouble();
        double soma = nota1 + nota2 + nota3 + nota4;
        double media = soma / 4;
        System.out.println(nome);
        if (media >= 7) {
            System.out.println("Parabéns! Você conquistou média "+media+" e foi aprovado");
        }
        else {
            System.out.println("Mas que pena... Você conquistou média "+media+" e foi reprovado");
        }
    }
}
