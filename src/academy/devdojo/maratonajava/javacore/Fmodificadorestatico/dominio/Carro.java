package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 250;

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprime (){
        System.out.println("--------------");
        System.out.println("Nome "+this.nome);
        System.out.println("Velocidade máxima "+this.velocidadeMaxima);
        System.out.println("Velocidade limite "+Carro.velocidadeLimite);

    }

    public static void setVelocidadeLimite(double velocidadeLimite){
        Carro.velocidadeLimite = velocidadeLimite;
    }

    public static double getVelocidadeLimite () {
        return Carro.velocidadeLimite;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

}

// Colocando o static no atributo da classe, faz ele se tornar um valor comum para todas os objetos da classe
// ou seja, ele vira um atributo da classe e não do objeto criado

// metodos staticos não acessam atributos em instância já que existe, a possibilidade de não existir um objeto em memória
// por isso não é usado o this em métodos estaticos

// métodos estaticos devem ser criados quando os métodos não acessam nenhum atributo da instância

// métodos estaticos só podem usar variáveis e atributos estáticos
// mas atributos estáticos podem ser usados em métodos não estáticos, já que para os métodos não estáticos existirem
// antes, são criados os objetos, ou seja, haverá um objeto em memória para o atributo ser referenciado

// como além de estatico, o atributo também é privado, foi necessário a criação dos métodos get e set
// para definir e imprimir os valores