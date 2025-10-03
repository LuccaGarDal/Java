package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Lucca");
        lista.add("Lucca");

        for (String o : lista) {
            System.out.println(o);
        }

        add(lista, new  Consumidor("Lucca"));

        for (Object o : lista) {
            System.out.println(o);
        }

    }

    private static void add (List lista, Consumidor consumidor) {
        lista.add(consumidor);
    }
}
