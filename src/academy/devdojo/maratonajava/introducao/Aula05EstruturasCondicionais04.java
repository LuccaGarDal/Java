package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double salario = 100000;
        double taxa;
        double valorParaPagar;
        if (salario > 0 && salario <= 34712) {
            taxa = 9.70;
            valorParaPagar = salario * taxa / 100;
            System.out.println("A taxa do seu salário é de " + taxa + "%, você precisa pagar " + valorParaPagar + "R$ para o governo");

        } else if (salario >= 34713 && salario <= 68507) {
            taxa = 37.35;
            valorParaPagar = salario * taxa / 100;
            System.out.println("A taxa do seu salário é de " + taxa + "%, você precisa pagar " + valorParaPagar + "R$ para o governo");

        } else {
            taxa = 49.50;
            valorParaPagar = salario * taxa / 100;
            System.out.println("A taxa do seu salário é de " + taxa + "%, você precisa pagar " + valorParaPagar + "R$ para o governo");

        }


    }
}
