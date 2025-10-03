package academy.devdojo.maratonajava.javacore.Zgenerics;

import java.util.ArrayList;
import java.util.List;

public class WildcardTest02 {
    static void main() {
        List<Cachorro> cachorros = new ArrayList<>();
        List<Gato> gatos = new ArrayList<>();

    }

    private static void printConsulta(List<Animal> animals) {
        for (Animal animal : animals) {
            animal.consulta();
        }

        animals.add(new Cachorro());

    }

}
