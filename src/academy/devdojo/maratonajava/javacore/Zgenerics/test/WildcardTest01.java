package academy.devdojo.maratonajava.javacore.Zgenerics.test;

abstract class Animal {
    public abstract void consulta();
}

class Cachorro extends Animal {

    @Override
    public void consulta() {
        System.out.println("Consultando Cachorro");
    }
}

class Gato extends Animal {

    @Override
    public void consulta() {
        System.out.println("Consultando Gato");
    }
}

public class WildcardTest01 {
    static void main() {
        Gato [] gatos = {new Gato(), new Gato()};
        Cachorro[] cachorros = {new Cachorro(), new Cachorro()};
        printConsulta(gatos);
        printConsulta(cachorros);
        Animal[] animals = {new Gato(), new Cachorro()};
        Animal animal  = new Gato();
        printConsulta(animals);
    }

    private static void printConsulta(Animal[] animals) {
        for (Animal animal : animals) {
            animal.consulta();
        }

    }

}
