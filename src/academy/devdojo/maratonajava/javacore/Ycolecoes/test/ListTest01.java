package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    static void main(String[] args) {
        List <String> nomes = new ArrayList<>();
        nomes.add("Lucca");
        nomes.add("Jous");
        nomes.add("Julia");

        for (String nome : nomes) {
            System.out.println(nome);
        }
        System.out.println("----------------------------------------------");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }
    }
}
