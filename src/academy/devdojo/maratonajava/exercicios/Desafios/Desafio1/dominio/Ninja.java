package academy.devdojo.maratonajava.exercicios.Desafios.Desafio1.dominio;

import java.util.Scanner;

public class Ninja {
    private String nome;
    private int idade;
    private Missao missao;

    public Ninja() {
    }

    public Ninja(String nome, int idade, Missao missao) {
        this.nome = nome;
        this.idade = idade;
        this.missao = missao;
    }

    public void entradaDados () {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ninja, me diga seu nome: ");
        this.nome = scan.nextLine();
        System.out.println("Qual sua idade?");
        this.idade = scan.nextInt();
    }

    public void imprimir () {
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.missao);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Missao getMissao() {
        return missao;
    }

    public void setMissao(Missao missao) {
        this.missao = missao;
    }
}
