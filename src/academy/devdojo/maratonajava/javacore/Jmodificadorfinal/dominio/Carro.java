package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio;

public class Carro {
    private String nome;
    public static final double VELOCIDADE_LIMITE = 150;
    public final Comprador COMPRADOR = new Comprador();

    public final void imprime () {
        System.out.println(this.nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

// o modificador final para atributos, faz com que os mesmos não possam ser modificados ou acessados na classe estendida
// o modificador final para classes, faz com que a mesmas não possam ser extendidas
// o modificador final para métodos, faz com que eles não possam ser sobreescritos em uma classe extendida

// o modificador final é usado após o modificador de acesso public, private ou protected

