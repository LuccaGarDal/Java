package academy.devdojo.maratonajava.sistemacadastro.dominio;

public enum TipoPet {
    CACHORRO( "Cachorro"),
    GATO( "Gato");

    private final String nome;

    TipoPet(String nome) {
        this.nome = nome;

    }
    public String getNome() {
        return nome;
    }

}

