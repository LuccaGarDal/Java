package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public class FileLoader implements DataLoader, DataRemover {
    @Override
    public void load() {
        System.out.println("Carregando os dados do arquivo");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do arquivo");
    }

    @Override
    public void checkPermisison() {
        System.out.println("Checando permissões nos arquivos");
    }
}
