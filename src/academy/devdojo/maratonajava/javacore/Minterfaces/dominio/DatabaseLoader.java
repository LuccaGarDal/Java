package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public class DatabaseLoader implements DataLoader, DataRemover {
    @Override
    public void load() {
        System.out.println("Carregando os dados do banco de dados");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do Banco de dados");
    }

    @Override
    public void checkPermisison() {
        System.out.println("Checando permissões no banco de dados");
    }

    public static void retrieveMaxDataSize() {
        System.out.println("Dentro do retrieveMaxDataSize da DatabaseLoader");
    }
}
