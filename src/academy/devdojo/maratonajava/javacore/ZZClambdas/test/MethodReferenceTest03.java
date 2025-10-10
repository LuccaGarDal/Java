package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class MethodReferenceTest04 {
    static void main(String[] args) {
        List<String> nomes = new ArrayList<>(List.of("Lucca", "Ions", "Jous"));
        nomes.sort(String::compareTo);
        System.out.println(nomes);

        Function<String, Integer> stringToInt = Integer::parseInt;
        Integer apply = stringToInt.apply("10");
        System.out.println(apply);

        BiPredicate<List<String>, String> checkName = List::contains;
        System.out.println(checkName.test(nomes, "Lucca"));

    }
}
