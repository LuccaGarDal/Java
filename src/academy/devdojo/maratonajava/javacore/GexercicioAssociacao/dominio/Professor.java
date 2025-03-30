package academy.devdojo.maratonajava.javacore.GexercicioAssociacao.dominio;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor (String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public void imprime() {
        System.out.println("Nome: "+this.nome);
        System.out.println("Área de Especialidade: "+this.especialidade);
        System.out.println("Apresenta os seguintes seminários: ");
        if (seminarios == null) {return;}
        for (Seminario seminario : seminarios) {
            System.out.println(seminario.getNome());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
