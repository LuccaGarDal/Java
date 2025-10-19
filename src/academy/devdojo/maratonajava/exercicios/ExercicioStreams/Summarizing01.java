package academy.devdojo.maratonajava.exercicios.ExercicioStreams;


import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

class Produto {
    String nome;
    double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }



    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}

public class Summarizing01 {
    static void main(String[] args) {
        List<Integer> numeros = List.of(5,10,15,20,25);

        List<Produto> produtos = List.of(
                new Produto("Brinquedo", 15.99),
                new Produto("Maçã", 4.85),
                new Produto("Celular", 599.00),
                new Produto("Carro", 21_000.00)
        );

        List<Double> notas = List.of(9.5, 1.5, 3.3, 6.6);

        IntSummaryStatistics collect = numeros.stream()
                .collect(Collectors.summarizingInt(s -> s));
        System.out.println(collect);

        DoubleSummaryStatistics collect1 = produtos.stream()
                .map(Produto::getPreco)
                .collect(Collectors.summarizingDouble(d -> d));

        System.out.println(collect1);

        DoubleSummaryStatistics collect2 = produtos.stream()
                .map(Produto::getPreco)
                .filter(aDouble -> aDouble > 100)
                .collect(Collectors.summarizingDouble(d -> d));

        System.out.println(collect2);

        DoubleSummaryStatistics collect3 = notas.stream()
                .collect(Collectors.summarizingDouble(d -> d));

        System.out.println(collect3);


    }
}
