package academy.devdojo.maratonajava.exercicios.ExercicioPadroes.Builder;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class UserTest01 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean valido = true;
        while(valido) {
            System.out.println("---Cadastro de usuário----");
            System.out.println("Digite o usuário: ");
            String usuario = scanner.nextLine();
            System.out.println("Digite a idade: ");
            int age = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Digite o nome: ");
            String name = scanner.nextLine();
            int id = ThreadLocalRandom.current().nextInt(1, 1_000_000);
            User user = User.UserBuilder
                    .builder()
                    .username(usuario)
                    .age(age)
                    .id(id)
                    .nome(name)
                    .build();
            System.out.println("Foi criado o usuário: ");
            System.out.println(user);
            System.out.println("Deseja criar outro usuário?");
            System.out.println("1 - Sim 2 - Não");
            int opcao = scanner.nextInt();
            scanner.nextLine();
            if (opcao == 2) {
                valido = false;
            }


        }




    }
}
