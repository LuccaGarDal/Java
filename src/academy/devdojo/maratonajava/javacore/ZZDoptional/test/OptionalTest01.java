package academy.devdojo.maratonajava.javacore.ZZDoptional.test;

import java.util.List;
import java.util.Optional;

public class OptionalTest01 {
    static void main(String[] args) {

        Optional<String> stringOptional = Optional.of("Luccaaaaaao");
        Optional<String> stringOptional2 = Optional.ofNullable(null);
        Optional<String> stringOptional3 = Optional.empty();

        Optional<String> os1 = findName("Lucca");
        String empty = os1.orElse("EMPTY");
        System.out.println(empty);
        os1.ifPresent(s -> System.out.println(s.toUpperCase()));


    }

    public static Optional<String> findName (String name) {
        List<String> list = List.of("Lucca", "Jous");
        int i = list.indexOf(name);
        if (i != -1) {
            return Optional.of(list.get(i));
        }
        return Optional.empty();
    }
}
