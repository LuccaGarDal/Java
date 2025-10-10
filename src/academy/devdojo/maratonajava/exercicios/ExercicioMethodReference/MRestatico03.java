package academy.devdojo.maratonajava.exercicios.ExercicioMethodReference;

import java.util.ArrayList;
import java.util.List;

class Matematica {
    public static int dobrar (int a) {
        return a * 2;
    }
}

public class MRestatico03 {
    static void main(String[] args) {
        List<Integer> nums = new ArrayList<> (List.of(1, 2, 3, 4 ,5 ,6));
        nums.replaceAll(Matematica::dobrar);
        System.out.println(nums);
    }
}
