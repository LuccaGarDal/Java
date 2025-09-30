package academy.devdojo.maratonajava.exercicios.Desafios.Desafio1.dominio;

public class Missao {
    private String nome;
    private char nivel;
    private StatusMissao statusMissao;
    private String descricao;

    public Missao(String nome, char nivel, StatusMissao statusMissao, String descricao) {
        this.nome = nome;
        this.nivel = nivel;
        this.statusMissao = statusMissao;
        this.descricao = descricao;
    }

    public Missao(String nome, char nivel, StatusMissao statusMissao) {
        this.nome = nome;
        this.nivel = nivel;
        this.statusMissao = statusMissao;
    }

    @Override
    public String toString() {
        return "Missao{" +
                "nome='" + nome + '\'' +
                ", nivel=" + nivel +
                ", statusMissao=" + statusMissao +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public char getNivel() {
        return nivel;
    }

    public void setNivel(char nivel) {
        this.nivel = nivel;
    }

    public StatusMissao getStatusMissao() {
        return statusMissao;
    }

    public void setStatusMissao(StatusMissao statusMissao) {
        this.statusMissao = statusMissao;
    }
}
