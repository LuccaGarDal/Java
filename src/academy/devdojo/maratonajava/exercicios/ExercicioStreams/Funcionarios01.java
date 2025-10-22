package academy.devdojo.maratonajava.exercicios.ExercicioStreams;

import java.util.*;
import java.util.stream.Collectors;

class Funcionario {
    private String nome;
    private String cargo;
    private double salario;

    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", cargo='" + cargo + '\'' +
                ", salario=" + salario +
                '}';
    }
}

public class Funcionarios01 {
    static void main(String[] args) {
        List<Funcionario> funcionarios = List.of(
                new Funcionario ("Lucca Garcia", "Junior", 1500.00),
                new Funcionario ("Josué Kuhim", "Pleno", 6500.0),
                new Funcionario ("Iann Lino", "Junior", 2000.00),
                new Funcionario ("Italo Lino", "Senior", 11500.00),
                new Funcionario ("Vini", "Pleno", 4250.00)
        );

        Map<String, List<Funcionario>> collect1 = funcionarios.stream()
                .collect(Collectors.groupingBy(Funcionario::getCargo));

        System.out.println(collect1);

        Map<String, Double> collect = funcionarios.stream()
                .collect(Collectors.groupingBy(Funcionario::getCargo, Collectors.averagingDouble(Funcionario::getSalario)));

        System.out.println(collect);

        Optional<Map.Entry<String, Double>> max = collect.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue());

        System.out.println(max);
    }
}
