package academy.devdojo.maratonajava.exercicios.ExerciciosLambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Predicate01 {
    static void main(String[] args) {
        List<Integer> integerList = List.of(1,2,3,4,5,6,7,8);
        System.out.println(filter(integerList, num -> num > 4));
        System.out.println(filter(integerList, num -> num.toString().startsWith("1")));
        System.out.println(filter(integerList, num -> num % 2 == 0));

    }

    public static List<Integer> filter(List<Integer> list, Predicate<Integer> predicate) {
        List<Integer> filteredList = new ArrayList<>();
        for (Integer i : list) {
            if (predicate.test(i)) {
                filteredList.add(i);
            }
        }
        return filteredList;

    }
}
