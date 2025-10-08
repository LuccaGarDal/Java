package academy.devdojo.maratonajava.javacore.ZZBcomportamentos.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamentos.dominio.Car;
import academy.devdojo.maratonajava.javacore.ZZBcomportamentos.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest03 {
    private static List<Car> listCar = List.of(new Car("green", 2015), new Car("red", 2019), new Car("blue", 2021));

    static void main(String[] args) {
        System.out.println(filter(listCar, car -> car.getColor().equalsIgnoreCase("green")));

        List<Integer> integerList = List.of(1,2,3,4,5,6,7,8,9,10);
        System.out.println(filter(integerList, num -> num % 2 == 0));


    }

    private static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> filteredList = new ArrayList<>();
        for (T t : list) {
            if (predicate.test(t)) {
                filteredList.add(t);
            }
        }
        return filteredList;


    }
}
