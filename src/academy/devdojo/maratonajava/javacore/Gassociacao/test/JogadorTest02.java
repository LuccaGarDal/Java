package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador ("Pelé");
        Time time1 = new Time ("Barcelona");

        jogador1.setTime(time1);
        jogador1.imprime();
    }
}

// Caso o método imprime seja colocado antes do método set ser usado para definir o time, ele não irá imprimir o time
