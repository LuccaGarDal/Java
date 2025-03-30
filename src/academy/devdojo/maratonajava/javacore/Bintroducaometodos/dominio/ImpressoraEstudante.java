package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class ImpressoraEstudante {
    public void imprime (Estudante estudante) {
        System.out.println("----------");

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        estudante.nome = "Gohan";
    }
}

// quando é passado parâmetros via referência, é passado a própria referência que estamos citando
// Nesse caso, "estudante" da impressora, recebe as referências das referências que estamos colocando como parâmetro
// que seriam estudante01 e estudante02
