package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio;

public class BuilderPatternTest01 {
    static void main(String[] args) {
        Person build = new Person.PersonBuilder()
                .firstName("Lucca")
                .lastName("Garcia")
                .username("LuccaoBoladao")
                .email("luccagarcia.dev@gmail.com")
                .build();

        System.out.println(build);
    }
}
