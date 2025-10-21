package academy.devdojo.maratonajava.exercicios.ExercicioStreams;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class SummarizingInt01 {
    static void main(String[] args) {

        List<Integer> listInteger = List.of(10, 20, 30, 40, 50);

        IntSummaryStatistics collect = listInteger.stream()
                .collect(Collectors.summarizingInt(s -> s));

        System.out.println(collect);

    }
}
