package academy.devdojo.maratonajava.exercicios.Desafios.Desafio1.dominio;

public enum StatusMissao {
    CONCLUIDA ("Missão Concluída"),
    NAO_CONCLUIDA ("Missão não concluída");

    private String nome;

    StatusMissao(String nome) {
        this.nome = nome;
    }
}
