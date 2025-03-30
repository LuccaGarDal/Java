package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Anime {
    private String nome;
    private static int [] episodios;

    // 0 - Bloco de inicialização é executado quando a JVM carregar a classe
    // 1 - É alocado espaço em memória pro objeto
    // 2 - Cada atributo de classe é criado e inicializado com valores default ou o que for passado
    // 3 - Bloco de incialização é executado
    // 4 - Construtor é executado

    static {
        System.out.println("Dentro do Bloco de inicializacao 1");
        episodios = new int [100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    static {
        System.out.println("Dentro do Bloco de inicializacao estático 2");
    }

    static {
        System.out.println("Dentro do Bloco de inicializacao estático 3");
    }

    {
        System.out.println("Dentro do Bloco de inicializacao não estático");
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {

        for(int episodio : Anime.episodios) {
            System.out.print(episodio +" ");
        }
        System.out.println();
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public String getNome() {
        return nome;
    }
}

// o bloco de inicialização estático é o primeiro que é executado e ele é executado apenas uma vez independente da
// da quantidade de objetos

// o bloco de inicialização não estático é iniciado após e é executado dependendo da quantidade de objetos criados