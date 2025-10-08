package academy.devdojo.maratonajava.exercicios.Desafios.Desafio3;

public class ContaBancaria {
    private long numero;
    private double saldo;
    private String titular;

    public ContaBancaria(long numero, double saldo, String titular) {
        this.numero = numero;
        this.saldo = saldo;
        this.titular = titular;
    }

    public void depositar(double valorDeposito) {
        saldo = saldo + valorDeposito;
        System.out.println("Foram depositados " + valorDeposito);
        System.out.println("Agora o seu saldo é de: " + this.saldo);
    }

    public void sacar (double valorSaque) {
        if (valorSaque > saldo) {
            System.out.println("Não é possível saquer uma quantia maior que o saldo");
        } else {
            saldo = saldo - valorSaque;
            System.out.println("Você sacou " + valorSaque);
            System.out.println("Seu saldo agora é de: " + this.saldo);
        }
    }

    public void transferir (double valorTransferencia, long numeroConta) {
        if (valorTransferencia > saldo) {
            System.out.println("Não é possível transferir uma quantia maior que o saldo");
        } else {
            saldo = saldo - valorTransferencia;
            System.out.println("Você transferiu " + valorTransferencia + " para a conta de número " + numeroConta);
            System.out.println("Seu saldo agora é de: " + this.saldo);
        }
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    static void main() {
        ContaBancaria contaBancaria = new ContaBancaria(1234, 1000, "Lucca");
        System.out.println(contaBancaria.getSaldo());
        contaBancaria.depositar(10000);
        contaBancaria.sacar(5000);
        contaBancaria.transferir(3000, 1010);
    }
}
