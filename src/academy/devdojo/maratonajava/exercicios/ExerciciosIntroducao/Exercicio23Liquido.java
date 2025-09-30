package academy.devdojo.maratonajava.exercicios.ExerciciosIntroducao;

import java.util.Scanner;

public class Exercicio23Liquido {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Vamos calcular o seu salário líquido");
        System.out.println("Digite quanto você ganha por hora aula: ");
        double realHora = entrada.nextDouble();
        System.out.println("Agora digite quantas aulas no mês você dá: ");
        double aulasMes = entrada.nextDouble();
        System.out.println("Por último, digite o percentual de desconto do INSS: ");
        double percentual = entrada.nextDouble();
        double salarioBruto = realHora * aulasMes;
        double porcentagem = percentual / 100;
        double salarioLiquido = salarioBruto - (salarioBruto * porcentagem);
        System.out.println("O seu salário líquido é de "+salarioLiquido+ "R$");
    }
}
