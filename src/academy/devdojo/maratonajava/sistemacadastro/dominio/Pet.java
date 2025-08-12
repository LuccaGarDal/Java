package academy.devdojo.maratonajava.sistemacadastro.dominio;

public class Pet {
    private String nome;
    private TipoPet tipoPet;
    private TipoSexo tipoSexo;
    private String endereco;
    private int idade;
    private int peso;
    private String raca;

    public Pet (String nome, TipoPet tipoPet, TipoSexo tipoSexo, String endereco, int idade, int peso, String raca) {
        this.nome = nome;
        this.tipoPet = tipoPet;
        this.tipoSexo = tipoSexo;
        this.endereco = endereco;
        this.idade = idade;
        this.peso = peso;
        this.raca = raca;
    }

    public void imprimir (){
        System.out.println(this.nome);
        System.out.println(this.tipoPet);
        System.out.println(this.tipoSexo);
        System.out.println(this.endereco);
        System.out.println(this.idade);
        System.out.println(this.peso);
        System.out.println(this.raca);
    }
}
