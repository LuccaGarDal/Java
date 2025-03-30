package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private int[] salarios;
    private double media = 0;

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        for (double salario : salarios) {
            System.out.println(salario + "");
        }
    }

    public void imprimeMediaSalarios() {

        for (double salario : salarios) {
            media += salario;
        }
        media /= salarios.length;
        System.out.println("A média dos salários é "+media);
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

    public int[] getSalarios() {
        return salarios;
    }

    public void setSalarios(int[] salarios) {
        this.salarios = salarios;
    }

    public double getMedia() {
        return media;
    }

}

// para evitar que o valor do atributo média seja modificado, foi retirado a função set dentro da classe
