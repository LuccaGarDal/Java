package academy.devdojo.maratonajava.exercicios.ExerciciosList.ExercicioComparator;

import java.util.Objects;

public class Celular {
    private String marca;
    private double preco;

    public Celular(String marca, double preco) {
        this.marca = marca;
        this.preco = preco;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Celular celular = (Celular) o;
        return Double.compare(preco, celular.preco) == 0 && Objects.equals(marca, celular.marca);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca, preco);
    }

    @Override
    public String toString() {
        return "Celular{" +
                "marca='" + marca + '\'' +
                ", preco=" + preco +
                '}';
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
