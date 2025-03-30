package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Midoriya";
        estudante01.idade = 15;
        estudante01.sexo = 'M';

        System.out.println("----------");

        estudante02.nome = "Sakura";
        estudante02.idade = 14;
        estudante02.sexo = 'F';

        impressora.imprime(estudante01);

        impressora.imprime(estudante02);

        System.out.println("===================");

        impressora.imprime(estudante01);

        impressora.imprime(estudante02);
    }
}

// ao modificar a referência dentro da classe da Impressora ("Gohan"), a referência original também é alterada
// já que não é uma cópia que é enviada, e sim a própria informação
// boas práticas: não alterar os dados de dentro do objeto no método]
// como os dados foram alterados após o println, eles so foram alterados após uma nova impressão