package academy.devdojo.maratonajava.sistemacadastro.dominio;

public class Pet {
    private String nome;
    private TipoPet tipoPet;
    private TipoSexo tipoSexo;
    private String endereco;
    private double idade;
    private double peso;
    private String raca;

    public Pet () {

    }

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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoPet getTipoPet() {
        return tipoPet;
    }

    public void setTipoPet(TipoPet tipoPet) {
        this.tipoPet = tipoPet;
    }

    public TipoSexo getTipoSexo() {
        return tipoSexo;
    }

    public void setTipoSexo(TipoSexo tipoSexo) {
        this.tipoSexo = tipoSexo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getIdade() {
        return idade;
    }

    public void setIdade(double idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}
