package academy.devdojo.maratonajava.exercicios.ExercicioStreams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Produto1 {
    private String nome;
    private double preco;

    public Produto1(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Produto1{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }
}

public class Produto01 {
    static void main(String[] args) {

        List<Produto1> produto1s = List.of(
                new Produto1("Carro", 55000.00),
                new Produto1("Copo", 5.00),
                new Produto1("Tesoura", 18.00),
                new Produto1("Escada", 200.00),
                new Produto1("Computador", 2000.00)
        );

        String collect = produto1s.stream()
                .filter(s -> s.getPreco() > 100)
                .sorted(Comparator.comparing(Produto1::getPreco).reversed())
                .limit(3)
                .map(Produto1::getNome)
                .collect(Collectors.joining(", "));

        System.out.println(collect);


    }
}
