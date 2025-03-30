package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Robertinho");
        funcionario.setIdade(69);
        funcionario.setSalarios(new int[] {1000, 3000, 5000});

        funcionario.imprime();

        funcionario.imprimeMediaSalarios();



    }
}
