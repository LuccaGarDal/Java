package academy.devdojo.maratonajava.exercicios;

import java.util.Scanner;

public class Exercicio15Anos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o ano em que você nasceu: ");
        int anoDeNascimento = entrada.nextInt();
        int anoAtual = 2025;
        int anos = anoAtual - anoDeNascimento;
        int diasTotais = anos * 365;
        int diasUltimoAno = diasTotais % 365;
        int meses = diasUltimoAno / 30;
        int dias =  diasUltimoAno % 30;
        System.out.println("Você viveu "+anos+" anos, "+meses+" meses e "+dias+" dias.");
    }
}

// Este exercicio nao faz sentido