package academy.devdojo.maratonajava.exercicios.ExercicioMethodReference;

import java.util.ArrayList;
import java.util.List;

class Texto {
    public static void mostrarComPrefixo (String s) {
        System.out.println("Palavra: " + s);
    }
}

public class MRestatico04 {
    static void main(String[] args) {
        List<String> palavras = new ArrayList<>(List.of("Copo", "Madeira", "Computador" ));
        palavras.forEach(Texto::mostrarComPrefixo);

    }
}
