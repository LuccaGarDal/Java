package academy.devdojo.maratonajava.exercicios.Desafios.Desafio3;

public class Produto {
    private String nome;
    private double preco;
    private int quantiadde;
    private static int contador = 0;

    public Produto(String nome, double preco, int quantiadde) {
        this.nome = nome;
        this.preco = preco;
        this.quantiadde = quantiadde;

        contador++;
    }

    {
        System.out.println("Criando classe produto");
    }


    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Produto.contador = contador;
    }

    static void main(String[] args) {
        Produto produto = new Produto("P1", 100, 1 );
        Produto produto2 = new Produto("P2", 150, 2 );
        Produto produto3 = new Produto("P3", 500, 1 );

        System.out.println(Produto.getContador());
    }
}
