package academy.devdojo.maratonajava.javacore.Ycolecoes.dominio;

import java.util.concurrent.ThreadLocalRandom;

public class Consumidor {
    private long id;
    private String nome;

    public Consumidor (String nome) {
        this.id = ThreadLocalRandom.current().nextLong(0, 10000);
        this.nome = nome;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
