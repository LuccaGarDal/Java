package academy.devdojo.maratonajava.sistemacadastro.dominio;

public enum TipoSexo {
    MACHO ("Macho"),
    FEMEA ("Femea");

    private String nome;

    TipoSexo(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
