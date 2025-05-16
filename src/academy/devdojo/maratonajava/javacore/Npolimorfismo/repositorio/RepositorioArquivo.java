package academy.devdojo.maratonajava.javacore.Npolimorfismo.repositorio;

public class RepositorioArquivo implements Repositorio{
    @Override
    public void salvar() {
        System.out.println("Salvando no Banco de Dados ");
    }
}
