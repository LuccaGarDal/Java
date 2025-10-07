package academy.devdojo.maratonajava.exercicios.Desafios.Desafio2;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class FolhaDePagamento {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o nome: ");
        String nome = scan.nextLine();

        System.out.println("Digite o salário bruto: ");
        double salario = scan.nextDouble();

        System.out.println("Digite o número de dependentes: ");
        int dependentes = scan.nextInt();

        double desconto = 0;

        if (salario <= 2000.00) {
            desconto = salario * 0.05;
        }
        else if (salario >= 2000.01 && salario < 5000) {
            desconto = salario * 0.1;
        }
        else if (salario >= 5000) {
            desconto = salario * 0.2;
        }

        double abatimentoDependente = dependentes * 100;

        double salarioLiquido = salario - desconto + abatimentoDependente;

        Locale localebr = Locale.of("pt", "BR");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(localebr);
        String salarioFormatado = numberFormat.format(salarioLiquido);

        System.out.println("Nome: " + nome);
        System.out.println("Salário Líquido: " + salarioFormatado);
    }
}
