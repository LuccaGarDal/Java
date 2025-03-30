package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        Pessoa pessoa = new Pessoa("Luffy");
        endereco.setRua("Rua Thousand Sunny");
        endereco.setCep("41830-480");
        pessoa.setCpf("094.301.115-90");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Sanji");
        funcionario.setCpf("094.300.110-90");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);

        System.out.println("----------");
        funcionario.imprime();
    }
}

// ao usar a palavra extends ao lado da classe, vc informar que o funcionario É uma pessoa e que vc estará
// extendendo ela.
// a formula então seria: CLASSE(MAIS ESPECIFICA) EXTENDS CLASSE (MENOS ESPECIFICA)

// entretanto, ao extender a classe, é pego também os métodos da classe extendida, por isso que o no funcionario.imprime
// não é impresso o salário, apenas os atributos especificados no método