package academy.devdojo.maratonajava.exercicios.ExercicioHashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMap04 {
    static void main() {
        Map<String, Double> boletim = new HashMap<>();
        boletim.put("Lucas", 9D);
        boletim.put("Caio", 8D);
        boletim.put("Marcos", 10D);
        boletim.put("Carlos", 5D);

        for (Map.Entry<String, Double> entry : boletim.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        String melhorAluno = null;
        double maiorNota = Double.MIN_VALUE;

        for (Map.Entry<String, Double> entry : boletim.entrySet()) {
            if (entry.getValue() > maiorNota) {
                maiorNota = entry.getValue();
                melhorAluno = entry.getKey();
            }
        }

        System.out.println("Aluno com maior nota: " + melhorAluno + " (" + maiorNota + ")");
    }

}
