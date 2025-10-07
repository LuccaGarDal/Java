package academy.devdojo.maratonajava.exercicios.ExercicioGenerics.ClasseGenerica;

public class Caixa<T> {
    private T valor;

    public Caixa(T valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Caixa{" +
                "valor=" + valor +
                '}';
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }
}
