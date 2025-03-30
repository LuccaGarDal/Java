package academy.devdojo.maratonajava.javacore.GexercicioAssociacao.dominio;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Professor professor;
    private Local local;

    public Seminario (String nome, Local local) {
        this.titulo = nome;
        this.local = local;
    }

    public void imprime() {
        System.out.println("Título: "+this.titulo);
        System.out.println("Local: "+local.getEndereco());
        System.out.println("Professor: "+professor.getNome());
        System.out.println("Alunos: ");
        if (alunos == null) { return; }
        for (Aluno aluno : alunos) {
            System.out.println(aluno.getNome());
        }
    }



    public String getNome() {
        return titulo  ;
    }

    public void setNome(String nome) {
        this.titulo  = nome;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
