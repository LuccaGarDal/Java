package academy.devdojo.maratonajava.exercicios.Desafios.Desafio1.test;

import academy.devdojo.maratonajava.exercicios.Desafios.Desafio1.dominio.Missao;
import academy.devdojo.maratonajava.exercicios.Desafios.Desafio1.dominio.Ninja;
import academy.devdojo.maratonajava.exercicios.Desafios.Desafio1.dominio.StatusMissao;

import java.util.Scanner;

public class KonohaTest1 {
    static void main() {
        Ninja ninja = new Ninja();
        Missao m1 = new Missao("Resgatar Sasuke", 'A', StatusMissao.NAO_CONCLUIDA, "Ir até a base do orochimaru para resgatar sasuke uchiha");
        Missao m2 = new Missao("Derrotar Madara no vale do fim", 'S', StatusMissao.NAO_CONCLUIDA, "Selar madara junto com tenten no vale do fim");
        Missao m3 = new Missao("Cozinhar para o hokage", 'A', StatusMissao.NAO_CONCLUIDA, "Cozinhar um filé com fritas para o hiruzen");

        boolean ninjaIsCriado = false;
        while (ninjaIsCriado == false) {
            ninja.entradaDados();
            int missaoEscolhida;

            Scanner scan = new Scanner(System.in);
            System.out.println("Qual missão você deseja pegar?");
            System.out.println("1 - " + m1.getNome());
            System.out.println("2 - " + m2.getNome());
            System.out.println("3 - " + m3.getNome());
            missaoEscolhida = scan.nextInt();

            switch (missaoEscolhida) {
                case 1:
                    System.out.println("Parabéns, você escolheu a missaõ para " + m1.getNome());
                    System.out.println("Descrição da missão:");
                    System.out.println(m1.getNivel() + "\n" + m1.getStatusMissao() + "\n" + m1.getDescricao());
                    ninja.setMissao(m1);
                    ninja.imprimir();
                    ninjaIsCriado = true;

            }

        }
    }
}