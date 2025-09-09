package academy.devdojo.maratonajava.unijorge2.AV2.dominio;

import java.util.Scanner;

public class Veiculo {
    protected int capacidadeTanque;
    protected double preco;
    protected int numeroPassageiros;

    public Veiculo() {
    }

    public Veiculo(int capacidadeTanque, double preco, int numeroPassageiros) {
        this.capacidadeTanque = capacidadeTanque;
        this.preco = preco;
        this.numeroPassageiros = numeroPassageiros;
    }

    public void imprimir() {
        System.out.println("Capaciade do Tanque: " + this.getCapacidadeTanque());
        System.out.println("Preço: " + this.getPreco());
        System.out.println("Número de Passageiros: " + this.getNumeroPassageiros());
    }

    public void entrada() {
        Scanner scan = new Scanner(System.in);

        boolean valido = false;
        while (!valido) {
            try {
                System.out.println("Digite a capacidade do tanque: ");
                this.capacidadeTanque = scan.nextInt();
                valido = true;
            } catch (Exception e) {
                System.out.println("Erro: digite um número inteiro válido!");
                scan.nextLine();
            }
        }
        valido = false;
        while (!valido) {
            try {
                System.out.println("Digite o preço: ");
                this.preco = scan.nextDouble();
                valido = true;
            } catch (Exception e) {
                System.out.println("Erro: digite um número real válido!");
                scan.nextLine();
            }
        }
        valido = false;
        while (!valido) {
            try {
                System.out.println("Digite o número de passageiros: ");
                this.numeroPassageiros = scan.nextInt();
                valido = true;
            } catch (Exception e) {
                System.out.println("Erro: digite um número inteiro válido!");
                scan.nextLine();
            }
        }
    }

    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getNumeroPassageiros() {
        return numeroPassageiros;
    }

    public void setNumeroPassageiros(int numeroPassageiros) {
        this.numeroPassageiros = numeroPassageiros;
    }
}
