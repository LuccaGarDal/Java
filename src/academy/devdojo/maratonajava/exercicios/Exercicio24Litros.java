package academy.devdojo.maratonajava.exercicios;

import java.util.Scanner;

public class Exercicio24Litros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escreva quantas horas durou a viagem: ");
        double horas = entrada.nextDouble();
        System.out.println("Escreva a velocidade média da viagem: ");
        double velocidadeMedia = entrada.nextDouble();
        double distancia = horas * velocidadeMedia;
        double litros = distancia/12;

        System.out.println("A viagem durou "+horas+" horas");
        System.out.println("A velocidade média foi "+velocidadeMedia+"km/h");
        System.out.println("A distãncia percorrida foi de "+distancia+" km");
        System.out.println("E foram gastos"+litros+" litros de combustível");
    }
}
