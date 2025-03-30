package academy.devdojo.maratonajava.javacore.GexercicioAssociacao.test;

import academy.devdojo.maratonajava.javacore.GexercicioAssociacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.GexercicioAssociacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.GexercicioAssociacao.dominio.Professor;
import academy.devdojo.maratonajava.javacore.GexercicioAssociacao.dominio.Seminario;

public class SeminarioTest01 {
    public static void main(String[] args) {
        Local local1 = new Local("Sala de Direito");
        Local local2 = new Local ("Sala de Artes");
        Seminario seminario1 = new Seminario("Seminário sobre Politicas Sociais", local1);
        Seminario seminario2 = new Seminario("Seminário sobre Arte Contemporânea", local2);
        Aluno aluno1 = new Aluno("Lucas", 19);
        Aluno aluno2 = new Aluno("Jorge", 18);
        Aluno aluno3 = new Aluno("Caio", 20);
        Professor professor1 = new Professor("Marcelo", "Direito Social");
        Professor professor2 = new Professor("Carlos", "Arte e Sociedade");

        Aluno [] alunos = {aluno1, aluno2};
        Aluno [] alunos2 = {aluno3};
        Seminario[] seminarios = {seminario1};
        Seminario[] seminarios2 = {seminario2};

        seminario1.setAlunos(alunos);
        seminario1.setProfessor(professor1);
        seminario2.setAlunos(alunos2);
        seminario2.setProfessor(professor2);
        aluno1.setSeminario(seminario1);
        aluno2.setSeminario(seminario1);
        aluno3.setSeminario(seminario2);
        professor1.setSeminarios(seminarios);
        professor2.setSeminarios(seminarios2);
        local1.setSeminario(seminario1);
        local2.setSeminario(seminario2);


        seminario1.imprime();
        System.out.println("---------");
        seminario2.imprime();
        System.out.println("---------");
        aluno1.imprime();
        System.out.println("---------");
        aluno2.imprime();
        System.out.println("---------");
        aluno3.imprime();
        System.out.println("---------");
        professor1.imprime();
        System.out.println("---------");
        professor2.imprime();
        System.out.println("---------");
        local1.imprime();
        System.out.println("---------");
        local2.imprime();
    }
}


// correção:
// é importante sobrecarregar os construtores com cada atributo adicionada, para eles possam ser criados, caso assim
// seja desejado, na criação dos objetos.

// nesse caso, não é necessário que o atributo professor exista na classe seminário, já que não foi feito uma relação
// entre as duas classes na pergunta

// refazer código utilizando a sobrecarga de construtores, redefinindo os atributos e usando apenas um método imprime
