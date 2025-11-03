package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.test;

import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.Aircraft;

public class AircraftTest01 {
    static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");

    }

    public static void bookSeat (String seat) {
        Aircraft aircraft = new Aircraft("Ele");
        System.out.println(aircraft.bookSeat(seat));

    }
}
