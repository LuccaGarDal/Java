package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador ("Neymar");
        Jogador jogador2 = new Jogador ("Pelé");
        Time time1 = new Time("Santos");
        Jogador[] jogadores = {jogador1, jogador2};

        jogador1.setTime(time1);
        jogador2.setTime(time1);
        time1.setJogadores(jogadores);

        System.out.println("---Jogador---");

        jogador1.imprime();

        System.out.println("---Time---");

        time1.imprime();
    }
}

// É necessário definir usando o setTime, para qual time o jogador joga, como foi feito no jogador1 e no jogador2
