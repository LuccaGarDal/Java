package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class MetodoGenericoTest01 {
    static void main() {
        Barco barco = new Barco("JetSki");
        System.out.println(criarArrayComUmObjeto(barco));


    }

    private static <T> List<T> criarArrayComUmObjeto(T t) {
        List<T> list = new ArrayList<>();
        list.add(t);
        return list;
    }


}


