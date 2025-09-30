package academy.devdojo.maratonajava.exercicios.ExerciciosIntroducao;

import java.util.Scanner;

public class Exercicio13MaiorIdade {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = entrada.next();
        System.out.println("Digite a sua idade: ");
        int idade = entrada.nextInt();

        if (idade >= 18) {
            System.out.println("O seu nome é "+nome+" e você é maior de idade");
        } else if (idade > 0){
            System.out.println("O seu nome é "+nome+" e você é menor de idade");
        } else {
            System.out.println("Você digitou uma idade inválida");
        }

    }
}
