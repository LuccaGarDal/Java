package academy.devdojo.maratonajava.exercicios.ExerciciosLambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Lambda04 {
    static void main(String[] args) {
        List<String> stringList = List.of("Lucca", "AAAAAAAAAA","porraaaaaaaaaaaaaaaaaa");

        List<Integer> map = map(stringList, s -> s.length());
        System.out.println(map);

    }

    public static <T, R> List<R> map(List<T> list, Function<T, R> function) {
        List<R> returnList = new ArrayList<>();
        for (T t : list) {
            R r = function.apply(t);
            returnList.add(r);
        }
        return returnList;
    }
}
