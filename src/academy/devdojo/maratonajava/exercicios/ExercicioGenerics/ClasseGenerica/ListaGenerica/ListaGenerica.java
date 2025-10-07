package academy.devdojo.maratonajava.exercicios.ExercicioGenerics.ClasseGenerica.ListaGenerica;

import java.util.List;

public class ListaGenerica<T> {
    private List<T> lista;

    public ListaGenerica(List<T> lista) {
        this.lista = lista;
    }

    public void adicionar (T elemento) {
        lista.add(elemento);
    }

    public T obter (int index) {
        return lista.get(index);
    }

    public int tamanho () {
        return lista.size();
    }

    public List<T> getLista() {
        return lista;
    }

    public void setLista(List<T> lista) {
        this.lista = lista;
    }
}
