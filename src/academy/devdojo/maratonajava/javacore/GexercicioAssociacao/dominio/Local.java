package academy.devdojo.maratonajava.javacore.GexercicioAssociacao.dominio;

public class Local {
    private String endereco;
    private Seminario seminario;

    public Local (String endereco) {
        this.endereco = endereco;
    }

    public void imprime () {
        System.out.println("Endereço: "+endereco);
        if (seminario == null) { return; }
        else {
            System.out.println(seminario.getNome()+" acontece nesse local");
        }
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }
}
