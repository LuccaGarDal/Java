package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.test;

import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.Person;

public class BuilderPatternTest01 {
    static void main(String[] args) {
        Person build = Person.PersonBuilder
                .builder()
                .firstName("Lucca")
                .lastName("Garcia")
                .username("LuccaoBoladao")
                .email("luccagarcia.dev@gmail.com")
                .build();

        System.out.println(build);
    }
}
