package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Jiraya Sensei");
        Professor professor2 = new Professor("Kakash Sensei");
        Professor[] professores = {professor1, professor2};
        Escola escola1 = new Escola("Konoha", professores);

        escola1.imprime();


    }
}

// Nesse caso, foi mostrado como é criado uma array para guardar as informações dos objetos de professores criados
// foi feita a sobrecarga de construtores para que fosse possível a declaração dos atributos ao criar um novo objeto
