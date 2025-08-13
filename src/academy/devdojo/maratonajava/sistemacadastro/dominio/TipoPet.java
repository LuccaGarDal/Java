package academy.devdojo.maratonajava.sistemacadastro.dominio;

public enum TipoPet {
    CACHORRO(1, "Cachorro"),
    GATO(2, "Gato");

    private final String nome;
    private final int valor;

    TipoPet(int valor, String nome) {
        this.nome = nome;
        this.valor = valor;
    }


    public String getNome() {
        return nome;
    }

    public int getValor() {
        return valor;
    }
}

