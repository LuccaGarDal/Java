package academy.devdojo.maratonajava.exercicios.ExercicioHashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMap01 {
    static void main(String[] args) {
        Map<String, String> traducao = new HashMap<>();
        traducao.put("cachorro", "dog");
        traducao.put("pão", "bread");
        traducao.put("copo", "cup");

        String palavra;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        palavra = scan.nextLine();

        if (traducao.containsKey(palavra)) {
            System.out.println("A tradução de " + palavra + " é: " + traducao.get(palavra));
        } else {
            System.out.println("Ainda não há tradução para " + palavra);
        }

    }
}
