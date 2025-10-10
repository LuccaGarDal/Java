package academy.devdojo.maratonajava.exercicios.ExercicioMethodReference;

import java.util.ArrayList;
import java.util.List;

class Numero {
    public static boolean ehPar (int a) {
        return a % 2 != 0;
    }
}

public class MRestatico02 {
    static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);

        nums.removeIf(Numero::ehPar);
        System.out.println(nums);

    }


}
