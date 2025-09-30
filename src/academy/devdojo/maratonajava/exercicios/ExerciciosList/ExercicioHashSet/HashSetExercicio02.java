package academy.devdojo.maratonajava.exercicios.ExerciciosList.ExercicioHashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetExercicio02 {
    static void main(String[] args) {
        Set<Aluno> alunos = new HashSet<>();
        alunos.add(new Aluno("Lucca Garcia", 2217));
        alunos.add(new Aluno("Iann Lino", 3321));
        alunos.add(new Aluno("Josué Kuhim", 1234));
        alunos.add(new Aluno("Gabriel Garcia", 2211));
        alunos.add(new Aluno("Jamelao Garcia", 2211));

        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }


    }
}
