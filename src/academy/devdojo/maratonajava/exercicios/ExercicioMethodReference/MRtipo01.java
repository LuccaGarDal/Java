package academy.devdojo.maratonajava.exercicios.ExercicioMethodReference;

import java.util.ArrayList;
import java.util.List;

class Util {
    public static int compareByLength (String a, String b) {
        return Integer.compare(a.length(), b.length());
    }
}

public class MRtipo01 {
    static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(3);
        nums.add(2);
        nums.add(6);

        nums.sort(Integer::compare);
        System.out.println(nums);

        List<String> nomes = new ArrayList<>(List.of("Luccaaaaaa", "Jous"));
        nomes.sort(Util::compareByLength);
        System.out.println(nomes);

    }
}
