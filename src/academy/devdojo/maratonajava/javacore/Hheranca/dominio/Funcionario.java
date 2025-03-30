package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

import java.sql.SQLOutput;

public class Funcionario extends Pessoa{

    private double salario;
    static {
        System.out.println("Dentro do Bloco de Inicialização estático do Funcionário");
    }

    {
        System.out.println("Dentro do bloco de inicialização do Funcionário 1");
    }
    {
        System.out.println("Dentro do bloco de inicialização do Funcionário 2");
    }

    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro do Construtor do Funcionário");
    }

    public void imprime(){
        super.imprime();
        System.out.println(this.salario);
        System.out.println(this.nome);

    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}

// o código super.imprime() aqui é usado para a classe funcionario poder imprimir os souts do método imprime da classe
// pessoa, mas ao mesmo tempo. abaixo dele, para imprimir uma nova informação que não há na outra classe