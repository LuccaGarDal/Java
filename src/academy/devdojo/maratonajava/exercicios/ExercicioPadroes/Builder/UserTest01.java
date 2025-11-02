package academy.devdojo.maratonajava.exercicios.ExercicioPadroes.Builder;

public class UserTest01 {
    static void main(String[] args) {
        User build = User.UserBuilder
                .builder()
                .username("Lucca01")
                .age(12)
                .id(1)
                .nome("Lucca")
                .build();

        System.out.println(build);
    }
}
