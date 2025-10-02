package academy.devdojo.maratonajava.exercicios.ExercicioHashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMap02 {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um texto: ");
        String texto = scan.nextLine();
        String[] palavras = texto.split(" ");

        Map<String, Integer> contagem = new HashMap<>();

        for (String palavra : palavras) {
            if (contagem.containsKey(palavra)) {
                contagem.put(palavra, contagem.get(palavra) + 1);
            } else {
                contagem.put(palavra, 1);
            }
        }

        for (Map.Entry<String, Integer> entry : contagem.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

    }
}
