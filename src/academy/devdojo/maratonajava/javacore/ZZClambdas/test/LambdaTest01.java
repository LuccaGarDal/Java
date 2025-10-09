package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import java.util.List;
import java.util.function.Consumer;

public class LambdaTest01 {
    static void main(String[] args) {
        List<String> stringList = List.of("Lucca", "Garcia");
        List<Integer> integerList = List.of(1, 2, 3, 4);
        forEach(stringList, s -> System.out.println(s));
        forEach(integerList, i -> System.out.println(i));
    }

    public static <T> void forEach (List<T> list, Consumer<T> consumer) {
        for (T t : list) {
            consumer.accept(t);
        }

    }

}
