package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaTest02 {
    static void main() {
        List<String> stringList = List.of("Lucca", "Jous");
        List<Integer> integers = map(stringList, s -> s.length());
        List<String> strings = map(stringList, s -> s.toUpperCase());
        System.out.println(integers);
        System.out.println(strings);

    }

    public static <T, R> List<R> map(List<T> list, Function<T, R> function) {
        List<R> rList = new ArrayList<>();
        for (T t : list) {
            R r = function.apply(t);
            rList.add(r);
        }
        return rList;

    }
}
