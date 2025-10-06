package academy.devdojo.maratonajava.exercicios.ExercicioGenerics;

import java.util.List;

public class ServiceAnimais {

    public void alimentarAnimais(List<? extends Animal> list) {
        for (Animal animal : list) {
            System.out.println("Alimentando " + animal.getNome());
        }

    }

    public void adicionarCachorro (List<? super Cachorro> list) {
        list.add(new Cachorro("Krypto"));
        list.add(new Cachorro("Bolt"));
        System.out.println("Cachorros adicionados à lista");


    }

}
