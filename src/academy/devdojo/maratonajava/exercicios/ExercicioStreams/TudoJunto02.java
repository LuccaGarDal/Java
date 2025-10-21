package academy.devdojo.maratonajava.exercicios.ExercicioStreams;

import java.util.List;
import java.util.stream.Collectors;

class Pessoa {
    String nome;
    int idade;

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
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

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}

public class TudoJunto02 {
    static void main(String[] args) {
        List<Pessoa> pessoas = List.of(
                new Pessoa("Lucca", 41),
                new Pessoa("Gabriel", 23),
                new Pessoa("Josué", 35),
                new Pessoa("Iann", 21)
        );

        List<Pessoa> list = pessoas.stream()
                .filter(s -> s.getIdade() > 25)
                .toList();

        System.out.println(list);

        List<String> list1 = pessoas.stream()
                .map(Pessoa::getNome)
                .toList();

        System.out.println(list1);

        String collect = pessoas.stream()
                .map(Pessoa::toString)
                .collect(Collectors.joining(","));

        System.out.println(collect);

        pessoas.stream()
                .mapToDouble(Pessoa::getIdade)
                .average()
                .ifPresent(System.out::println);


    }
}
