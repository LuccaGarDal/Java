package academy.devdojo.maratonajava.exercicios.ExercicioGenerics.Wildcard;

import java.util.ArrayList;
import java.util.List;

public class AnimaisTest01 {
    static void main() {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Passaro"));
        animals.add(new Animal("Crocodilo"));
        animals.add(new Animal("Ave"));

        List<Cachorro> cachorros = new ArrayList<>();
        cachorros.add(new Cachorro("Labrador"));
        cachorros.add(new Cachorro("Rotweiler"));
        cachorros.add(new Cachorro("Pastor"));

        List<Gato> gatos = new ArrayList<>();
        gatos.add(new Gato("Persa"));
        gatos.add(new Gato("Frajola"));
        gatos.add(new Gato("Branco"));

        ServiceAnimais serviceAnimais = new ServiceAnimais();
        serviceAnimais.alimentarAnimais(animals);
        serviceAnimais.alimentarAnimais(cachorros);
        serviceAnimais.alimentarAnimais(gatos);

        serviceAnimais.adicionarCachorro(cachorros);
        for (Cachorro cachorro : cachorros) {
            System.out.println(cachorro.getNome());
        }

        serviceAnimais.adicionarCachorro(animals);
        for (Animal animal : animals) {
            System.out.println(animal.getNome());
        }


    }
}
