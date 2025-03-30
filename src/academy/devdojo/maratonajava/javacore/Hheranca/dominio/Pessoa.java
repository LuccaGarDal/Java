package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereco endereco;
    static {
        System.out.println("Dentro do Bloco de Inicialização estático da Pessoa");
    }

    {
        System.out.println("Dentro do bloco de inicialização da Pessoa 1");
    }
    {
        System.out.println("Dentro do bloco de inicialização da Pessoa 2");
    }

    public Pessoa (String nome){
        System.out.println("Dentro do Construtor da Pessoa");
        this.nome = nome;
    }

    public void imprime () {
        System.out.println(nome);
        System.out.println(cpf);
        System.out.println(endereco.getRua() +" "+ endereco.getCep());
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}

// ao trocar o tipo das referências dos atributos para protected ao invés de private, faz com que todas as classes
// que estejam dentro do pacote da classe Pessoa possam acessar tais atributos como se fosse públicos
// Além disso, classes que estejam foram do pacote, mas que usem o extends Pessoa, também podem acessar os atributos
