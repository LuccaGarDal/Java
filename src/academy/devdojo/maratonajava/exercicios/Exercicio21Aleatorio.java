package academy.devdojo.maratonajava.exercicios;

import java.util.Random;

public class Exercicio21Aleatorio {
    public static void main(String[] args) {
        Random ram = new Random();
        int num = ram.nextInt(101);
        System.out.println(num);
    }
}

