package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.dominio;

public class Anime {
    private String nome;
    private int [] episodios;

    // 1 - É alocado espaço em memória pro objeto
    // 2 - Cada atributo de classe é criado e inicializado com valores default ou o que for passado
    // 3 - Bloco de incialização é executado
    // 4 - Construtor é executado

    {
        System.out.println("Dentro do Bloco de inicializacao");
        episodios = new int [100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {

        for(int episodio : this.episodios) {
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

// a inicialização dos objetos acontece antes da do próprio construtor

//bloco de inicialização são essas chaves abertas que podem ser colocadas em qualquer lugar do código, mas que são
// comumente colocadas após os atributos, e que são executadas antes dos construtores