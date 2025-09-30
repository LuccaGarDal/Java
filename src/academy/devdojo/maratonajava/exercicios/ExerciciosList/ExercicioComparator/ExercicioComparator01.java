package academy.devdojo.maratonajava.exercicios.ExerciciosList.ExercicioComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class ComparatorByMarca implements Comparator<Celular> {

    @Override
    public int compare(Celular celular1, Celular celular2) {
        return celular1.getMarca().compareTo(celular2.getMarca());
    }
}

class ComparatorByPreco implements Comparator<Celular> {

    @Override
    public int compare(Celular celular1, Celular celular2) {
        return Double.compare(celular1.getPreco(), celular2.getPreco());
    }
}

public class ExercicioComparator01 {
    static void main() {
        List<Celular> celulares = new ArrayList<>();
        celulares.add(new Celular("Samsung", 1500));
        celulares.add(new Celular("Iphone", 8000));
        celulares.add(new Celular("Motorola", 1000));
        celulares.add(new Celular("Xiaomi", 3000));

        Collections.sort(celulares, new ComparatorByMarca());
        for (Celular celular : celulares) {
            System.out.println(celular);
        }

        System.out.println("--------------------");

        ComparatorByPreco comparatorByPreco = new ComparatorByPreco();

        Collections.sort(celulares, comparatorByPreco.reversed());
        for (Celular celular : celulares) {
            System.out.println(celular);
        }


    }
}
