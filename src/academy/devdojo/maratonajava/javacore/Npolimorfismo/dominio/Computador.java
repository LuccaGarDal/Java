package academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio;

public class Computador extends Produto{
    public static final double IMPOSTO_POR_CENTO_ = 0.21;
    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando Imposto do Computador");
        return this.valor * IMPOSTO_POR_CENTO_;
    }



}
