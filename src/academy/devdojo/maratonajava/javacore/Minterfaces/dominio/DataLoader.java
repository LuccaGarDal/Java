package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public interface DataLoader {
    public static final int MAX_DATA_SIZE = 10;
    public abstract void load();

    default void checkPermisison() {
        System.out.println("Fazendo checagem de permissões");
    }

    public static void retrieveMaxDataSize() {
        System.out.println("Dentro do retrieveMaxDataSize da interface");
    }
}
