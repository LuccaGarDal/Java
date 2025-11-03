package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.test;

import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.AircraftSingletonEnum;
import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.AircraftSingletonLazy;

public class AircraftSingletonEnumTest01 {
    static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");

    }

    public static void bookSeat (String seat) {
        AircraftSingletonEnum instance = AircraftSingletonEnum.INSTANCE;
        System.out.println(instance.bookSeat(seat));

    }
}
