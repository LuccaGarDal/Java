package academy.devdojo.maratonajava.javacore.ZZBcomportamentos.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamentos.dominio.Car;
import academy.devdojo.maratonajava.javacore.ZZBcomportamentos.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest02 {
    private static List<Car> listCar = List.of(new Car("green", 2015), new Car("red", 2019), new Car("blue", 2021));

    static void main(String[] args) {
        List<Car> greenCars = filter(listCar, new Predicate<Car>() {
            @Override
            public boolean test(Car car) {
                return car.getColor().equalsIgnoreCase("green");
            }
        });
        System.out.println(greenCars);

        List<Car> redCars = filter(listCar, car -> car.getColor().equalsIgnoreCase("red"));
        System.out.println(redCars);

        List<Car> yearBeforeCars = filter(listCar, car -> car.getYear() < 2020);
        System.out.println(yearBeforeCars);
    }

    private static List<Car> filter(List<Car> car, Predicate<Car> carPredicate) {
        List<Car> filteredCars = new ArrayList<>();
        for (Car car1 : car) {
            if (carPredicate.test(car1)) {
                filteredCars.add(car1);
            }

        }
        return filteredCars;

    }
}
