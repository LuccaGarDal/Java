package academy.devdojo.maratonajava.exercicios.ExerciciosIntroducao;

import java.util.Scanner;

public class Exercicio12Pagamento {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String produto = "Iphone 12 Pro Max";
        double valor = 12000;
        System.out.println("Produtos no estoque: "+produto+" Valor: "+valor);
        System.out.println("Digite qual a opção referente a forma de pagamento:");
        System.out.println("1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto");
        System.out.println("2 - À Vista no cartão de crédito, recebe 10% de desconto");
        System.out.println("3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros");
        System.out.println("4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%");
        int opcaoPagamento = entrada.nextInt();
        if (opcaoPagamento == 1) {
            double desconto = valor * 15/100;
            double valorFinal = valor - desconto;
            System.out.println("O valor final ficou: "+valorFinal);
        }
        else if (opcaoPagamento == 2) {
            double desconto = valor * 10/100;
            double valorFinal = valor - desconto;
            System.out.println("O valor final ficou: "+valorFinal);
        }
        else if (opcaoPagamento == 3) {
            double valorParcela = valor / 2;
            System.out.println("O valor final ficou: "+valor+", dividido em duas parcelas de: "+valorParcela);
        }
        else if (opcaoPagamento == 4){
            double juros = valor * 10/100;
            double valorFinal = valor + juros;
            System.out.println("O valor final ficou: "+valorFinal);
        }
        else {
            System.out.println("Você digitou uma opção inválida, tente de novo.");
        }
    }
}
