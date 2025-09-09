package academy.devdojo.maratonajava.unijorge2.AV2.dominio;

import java.util.Scanner;

public class Aviao extends Veiculo{
    String prefixo;
    String dataRevisao;

    public Aviao() {
    }

    public Aviao(int capacidadeTanque, double preco, int numeroPassageiros, String prefixo, String dataRevisao) {
        super(capacidadeTanque, preco, numeroPassageiros);
        this.prefixo = prefixo;
        this.dataRevisao = dataRevisao;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Prefixo: " + this.getPrefixo());
        System.out.println("Data da revisão: " + this.getDataRevisao());
    }

    @Override
    public void entrada() {
        super.entrada();
        Scanner scan = new Scanner(System.in);

        boolean valido = false;
        while (!valido) {
            try {
                System.out.println("Digite o prefixo: ");
                this.prefixo = scan.nextLine();
                valido = true;
            } catch (Exception e) {
                System.out.println("Erro: digite um valor válido!");
                scan.nextLine();
            }
        }
        valido = false;
        while (!valido) {
            try {
                System.out.println("Digite a última data de revisão: ");
                this.dataRevisao = scan.nextLine();
                valido = true;
            } catch (Exception e) {
                System.out.println("Erro: digite um valor válido!");
                scan.nextLine();
            }
        }
    }

    public void reajustarPreco(double porcentagem) {
        double precoReajustado = this.preco + (this.preco * porcentagem/100);
        this.preco = precoReajustado;
    }

    public String getPrefixo() {
        return prefixo;
    }

    public void setPrefixo(String prefixo) {
        this.prefixo = prefixo;
    }

    public String getDataRevisao() {
        return dataRevisao;
    }

    public void setDataRevisao(String dataRevisao) {
        this.dataRevisao = dataRevisao;
    }
}
