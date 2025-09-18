package academy.devdojo.maratonajava.unijorge2.AV2.dominio;

import java.util.Scanner;

public class Navio extends Veiculo {
    protected String nome;
    protected int numeroTripulantes;
    protected String dataLancamento;

    public Navio() {
    }

    public Navio(String nome) {
        this.nome = nome;
    }

    public Navio(String nome, int numeroTripulantes) {
        this.nome = nome;
        this.numeroTripulantes = numeroTripulantes;
    }

    public Navio(String nome, String dataLancamento) {
        this.nome = nome;
        this.dataLancamento = dataLancamento;
    }

    public Navio(String nome, int numeroTripulantes, String dataLancamento) {
        this.nome = nome;
        this.numeroTripulantes = numeroTripulantes;
        this.dataLancamento = dataLancamento;
    }

    public Navio(int capacidadeTanque, double preco, int numeroPassageiros, String nome, int numeroTripulantes, String dataLancamento) {
        super(capacidadeTanque, preco, numeroPassageiros);
        this.nome = nome;
        this.numeroTripulantes = numeroTripulantes;
        this.dataLancamento = dataLancamento;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Nome: " + this.nome);
        System.out.println("Número de tripulantes: " + this.numeroTripulantes);
        System.out.println("Data de lançamento: " + this.dataLancamento);

    }

    @Override
    public void entrada() {
        super.entrada();
        Scanner scan = new Scanner(System.in);
        boolean valido = false;
        while (!valido) {
            try {
                System.out.println("Digite o nome: ");
                this.nome = scan.nextLine();
                valido = true;
            } catch (Exception e) {
                System.out.println("Erro: digite um nome válido!");
                scan.nextLine();
            }
        }
        valido = false;
        while (!valido) {
            try {
                System.out.println("Digite o número de tripulantes: ");
                this.numeroTripulantes = scan.nextInt();
                valido = true;
            } catch (Exception e) {
                System.out.println("Erro: digite um valor válido!");
                scan.nextLine();
            }
        }
        scan.nextLine();
        valido = false;
        while (!valido) {
            try {
                System.out.println("Digite a data de lançamento: ");
                this.dataLancamento = scan.nextLine();
                valido = true;
            } catch (Exception e) {
                System.out.println("Erro: digite uma data válida!");
                scan.nextLine();
            }
        }

    }

    public double passageirosPorTripulantes() {
        double divisao = this.numeroPassageiros / this.numeroTripulantes;
        return divisao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroTripulantes() {
        return numeroTripulantes;
    }

    public void setNumeroTripulantes(int numeroTripulantes) {
        this.numeroTripulantes = numeroTripulantes;
    }

    public String getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(String dataLancamento) {
        this.dataLancamento = dataLancamento;
    }
}
