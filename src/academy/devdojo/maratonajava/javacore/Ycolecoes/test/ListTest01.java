package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    static void main(String[] args) {
        List <String> nomes = new ArrayList<>(16);
        List <String> nomes2 = new ArrayList<>(16);
        nomes.add("Lucca");
        nomes.add("Jous");
        nomes.add("Julia");

        nomes2.add("Garcia");
        nomes2.add("Ions");

        nomes.remove(0);
        nomes.remove("Jous");

        nomes.addAll(nomes2);

        for (String nome : nomes) {
            System.out.println(nome);
        }
        System.out.println("----------------------------------------------");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }
    }
}
