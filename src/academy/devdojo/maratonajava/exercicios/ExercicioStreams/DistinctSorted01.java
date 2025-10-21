package academy.devdojo.maratonajava.exercicios.ExercicioStreams;

import java.util.List;
import java.util.stream.Collectors;

public class DistinctSorted01 {
    static void main(String[] args) {
        List<Integer> integerList = List.of(10,2,3,4,2,3,7,9);

        List<Integer> list = integerList.stream()
                .distinct()
                .toList();

        System.out.println(list);

        List<Integer> list1 = integerList.stream()
                .distinct()
                .sorted()
                .toList();

        System.out.println(list1);
    }
}
